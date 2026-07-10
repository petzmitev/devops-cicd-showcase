# DevOps CI/CD Showcase

This repository demonstrates several CI/CD workflows and Azure DevOps pipelines that I completed while learning GitHub Actions and Azure DevOps.

## Repository Structure

```
.
├── github-actions/
│   ├── python-package.yml
│   ├── python-coverage.yml
│   ├── docker-publish.yml
│   ├── deploy-staging.yml
│   ├── deploy-production.yml
│   └── configure-azure-environment.yml
│
├── azure-devops/
│   ├── web-app-pipeline.yml
│   └── springboot-docker-pipeline.yml
│
├── sample-app/
│   └── Spring Boot sample application
│
└── screenshots/
```

## Technologies

- GitHub Actions
- Azure DevOps Pipelines
- Docker
- GitHub Container Registry (GHCR)
- Azure App Service
- Azure Container Registry (ACR)
- Spring Boot
- Java 21
- Maven

## GitHub Actions Workflows

- Python package build
- Python code coverage
- Docker image build & publish
- Deploy to Azure Staging
- Deploy to Azure Production
- Azure environment provisioning

## Azure DevOps Pipelines

### Web Application Pipeline

Stages:
- Build
- Deploy to Development
- Deploy to Staging

### Spring Boot Docker Pipeline

Stages:
- Build Docker Image
- Push to Azure Container Registry
- Deploy to Azure Web App

## Sample Application

The repository includes a simple Spring Boot application used for demonstrating CI/CD pipelines.

Endpoints:

- `/`
- `/health`

Run locally:

```bash
mvn spring-boot:run
```

Open:

```
http://localhost:8080
```

## Pipeline Results

Example successful pipeline executions are available in the **screenshots/** directory.

## Author

Peter Mitev
