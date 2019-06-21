variable "GITHUB_ORGANIZATION" {
  type = "string"
  description = "Название компании для которой управлять конфигурацией."
}

variable "GITHUB_TOKEN" {
  type = "string"
  description = "Секретный токен для запросов к API GitHub."
}

provider "github" {
  organization = var.GITHUB_ORGANIZATION
  token = var.GITHUB_TOKEN
}

resource "github_repository" "core-components" {
  name = "core-components"
  description = "Набор переиспользуемых инструментов для Java проектов."
  topics = [
    "core",
    "offline"
  ]

  lifecycle {
    prevent_destroy = true
  }

  allow_merge_commit = false
  allow_rebase_merge = false
  has_issues = false
  has_downloads = false
  has_projects = false
  has_wiki = false
  private = false
}
