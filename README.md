# CQRS and Event-Sourcing Demo Application

Проект для демонстрации подходов CQRS и Event-Sourcing.

## Common service 
Сервис содержит общий код и подключается как зависимость в сервисах Core service и Event-handler service.

## Core service
Сервис содержит REST API для взаимодействия с приложением.
Для аутентификации и авторизации использется Spring Security и Jwt токены.
Новые записи в таблице events с помощью Debezium и механизма CDC передаются в Kafka топик events.

## Event-handler service 
Сервис реализует слушателя Kafka для новых событий из топика events и обработку данных событий.

## Usage

Для старта приложения необходимо:

1. Запустить все сервисы в docker, выполнив следующую команду: 

```shell 
docker-compose up -d
```

2. В docker контейнере debezium, выполнить слеюущие команды:

```shell 
cd /on-startup/
```

```shell 
sh run.sh
```











