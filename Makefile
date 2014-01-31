pull:
	git pull --rebase --prune origin master

push:
	git push origin master

run-dev:
	lein run -m log-retriever.web 5000

deploy:
	git push heroku master

ps:
	heroku ps

open:
	heroku open

scale:
	heroku ps:scale web=1

logs:
	heroku logs

remote-repl:
	heroku run lein repl

tests:
	lein test
