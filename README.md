# springbootgke
sample project for GKE and github actions


1. gcloud auth login
2. docker build --platform linux/amd64 -t {appname}:{version} .
3. gcloud services enable artifactregistry.googleapis.com
4. gcloud artifacts repositories create {Google_Artifactory_Repo} --repository-format=docker --location=us-{location} --description="GKE Demo repo"
5. docker tag {appname}:{version} us-central1-docker.pkg.dev/{project_id}/{Google_Artifactory_Repo}/{appname}:{version}
6. docker push us-central1-docker.pkg.dev/{project_id}/{Google_Artifactory_Repo}/{appname}:{version}
