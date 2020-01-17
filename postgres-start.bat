docker run --name dev-artschool -e POSTGRES_USER=artschool -e POSTGRES_PASSWORD=artschool -e POSTGRES_DB=artschool -d -p 5432:5432 -v /var/lib/postgresql/dev-artschool  postgres 
