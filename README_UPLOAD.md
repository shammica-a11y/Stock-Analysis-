# Portfolio Android App + GitHub Actions

## Upload steps (from your phone)
1. Unzip this folder on your phone.
2. In your GitHub repo (browser), tap **Add file → Upload files**.
3. Select **all items inside** the unzipped `PortfolioAndroidApp/` folder (not the folder itself):
   - `app/` (folder)
   - `gradle/` (folder if present)
   - `build.gradle.kts`
   - `settings.gradle`
   - `gradlew`
   - `gradlew.bat`
   - `README_UPLOAD.md`
   - `.github/` (folder) → contains the workflow
4. Commit to **main**.
5. Go to **Actions → Android CI → Run workflow**.
6. Download the APK from **Artifacts** at the bottom of the run.
