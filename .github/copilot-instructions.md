<!-- Repository-specific instructions for AI coding agents -->
# Copilot Instructions

Purpose: provide concise, actionable guidance so AI coding agents are productive immediately in this repository.

- **Repo summary**: This workspace contains two distinct areas:
  - Day-to-day Java DSA solutions (root .java files like `BubbleSort.java`, `insertionSort.java`). These are single-file programs used for practice.
  - A full Python project `smart-traffic-monitoring/` — a YOLOv8-based traffic monitoring system with `src/`, `config/`, `data/`, `templates/`, and tests.

- **High-level architecture (smart-traffic-monitoring)**:
  - Video Input -> `src/vehicle_detector.py` (YOLOv8) -> `src/traffic_analyzer.py` -> `src/signal_controller.py` -> Dashboard / Alerts / Reports (`src/alert_system.py`, `src/report_generator.py`, `web_dashboard.py`).
  - Configuration is centralized in `smart-traffic-monitoring/config/config.yaml` and consumed through `src/utils/config_manager.py`.

- **Primary workflows & commands**:
  - Create a Python venv and install deps:
    - `python -m venv .venv && .venv\Scripts\Activate.ps1` (Windows PowerShell)
    - `pip install -r smart-traffic-monitoring/requirements.txt`
  - Run dashboard: `python smart-traffic-monitoring/web_dashboard.py` (default host: http://localhost:5000)
  - Run CLI processing: `python smart-traffic-monitoring/main.py --source "data/input_videos/your.mp4"`
  - Advanced (reports + alerts): `python smart-traffic-monitoring/main_advanced.py --source <source>`
  - Tests: `python -m pytest smart-traffic-monitoring/tests` (uses `test_detector.py`)

- **Project-specific patterns & conventions**:
  - Config-driven: change runtime behavior via `smart-traffic-monitoring/config/config.yaml` (video.source, detection.model, signal.adaptive_mode).
  - Paths: input videos live under `smart-traffic-monitoring/data/input_videos/`; outputs/logs go to `smart-traffic-monitoring/data/output/` and `runs/detect/predict`.
  - Model handling: default detection model `yolov8n.pt` is referenced in both README and `config.yaml`; runtime code may auto-download or expect `smart-traffic-monitoring/yolov8n.pt`.
  - Logging: `src/utils/logger.py` provides the project's logging conventions; use `log_level` and `log_file` from config.

- **Integration points to watch**:
  - Detection -> Analyzer: `smart-traffic-monitoring/src/vehicle_detector.py` emits counts/objects consumed by `smart-traffic-monitoring/src/traffic_analyzer.py`.
  - Analyzer -> Controller: `traffic_analyzer` computes densities which `signal_controller` uses to pick green durations (see `signal` settings in `config.yaml`).
  - Dashboard & Alerts read the same in-memory metrics; changes to data shapes should be propagated to templates in `smart-traffic-monitoring/templates/index.html`.

- **Debugging tips / gotchas**:
  - If dashboard port 5000 is in use, kill the process (Windows): `netstat -ano | findstr :5000` then `taskkill /PID <pid> /F`.
  - If video does not load, verify `video.source` in `smart-traffic-monitoring/config/config.yaml` and file existence in `data/input_videos/`.
  - Performance: change `detection.model` (smaller = faster) or reduce `video.resize_factor` / `skip_frames` in `config.yaml`.
  - Tests use small, targeted detector tests in `smart-traffic-monitoring/tests/test_detector.py` — run only that file if iterating quickly.

- **When editing code**:
  - Keep Python package layout under `smart-traffic-monitoring/src/` — avoid breaking imports used by `web_dashboard.py` and `main.py`.
  - For new CLI flags, update `main.py` and `web_dashboard.py` consistently and add defaults to `config/config.yaml`.
  - Preserve existing YAML keys; the runtime code expects certain keys (`video.source`, `detection.model`, `signal.*`).

- **Files to inspect first when changing behavior**:
  - [smart-traffic-monitoring/config/config.yaml](smart-traffic-monitoring/config/config.yaml)
  - [smart-traffic-monitoring/src/vehicle_detector.py](smart-traffic-monitoring/src/vehicle_detector.py)
  - [smart-traffic-monitoring/src/traffic_analyzer.py](smart-traffic-monitoring/src/traffic_analyzer.py)
  - [smart-traffic-monitoring/src/signal_controller.py](smart-traffic-monitoring/src/signal_controller.py)
  - [smart-traffic-monitoring/web_dashboard.py](smart-traffic-monitoring/web_dashboard.py)

If any part of this guidance is unclear or you want more examples (e.g., exact call signatures to mock `vehicle_detector` outputs), tell me which area to expand and I will iterate.
