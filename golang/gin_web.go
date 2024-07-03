package main

import "github.com/gin-gonic/gin"

func main() {
	r := gin.New()
	r.Use(gin.Recovery())
	r.GET("/", func(c *gin.Context) {
		c.String(200, "Hello word!")
	})
	r.Run() // listen and serve on 0.0.0.0:8080
}
