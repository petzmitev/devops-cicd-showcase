# DevOps CI/CD Showcase

A collection of GitHub Actions workflows, Azure DevOps pipelines, and a sample Spring Boot application demonstrating modern CI/CD practices.

## Project Overview

This repository showcases different CI/CD solutions implemented during hands-on practice with GitHub Actions and Azure DevOps.

The project includes:

- GitHub Actions workflows
- Azure DevOps multi-stage pipelines
- Docker image build and publish
- Azure Web App deployments
- Sample Spring Boot application used for testing deployment pipelines

---

# Repository Structure

```
devops-cicd-showcase/
│
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
│   └── Simple Spring Boot application
│
├── screenshots/
│   ├── springboot-docker-pipeline.png
│   └── webapp-pipeline.png
│
└── README.md
```

---

# GitHub Actions

This repository contains workflows covering:

- Python package build
- Python test coverage
- Docker image build and publish to GitHub Container Registry
- Azure staging deployment
- Azure production deployment
- Azure environment provisioning

---

# Azure DevOps Pipelines

## Web Application Pipeline

Stages:

- Build
- Deploy to Development
- Deploy to Staging

---

## Spring Boot Docker Pipeline

Stages:

- Build Maven project
- Build Docker image
- Push image to Azure Container Registry
- Deploy container to Azure Web App

---

# Sample Application

The repository includes a minimal Spring Boot application used for validating the CI/CD pipelines.

Available endpoints:

| Endpoint | Description |
|----------|-------------|
| `/` | Returns a welcome message |
| `/health` | Returns application health status |

Run locally:

```bash
mvn spring-boot:run
```

Application URL:

```
http://localhost:8080
```

---

# Technologies

- GitHub Actions
- Azure DevOps
- Docker
- GitHub Container Registry (GHCR)
- Azure Container Registry (ACR)
- Azure Web App
- Spring Boot
- Java 21
- Maven
- YAML

---

# Pipeline Results

The `screenshots/` directory contains successful Azure DevOps pipeline executions included as proof of completed deployments.

---

# Author

**Peter Mitev**

Computer and Software Engineering student with an interest in:

- DevOps
- Cloud
- DevSecOps
- CI/CD Automation
