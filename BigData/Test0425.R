.libPaths()
.libPaths( "C:/Program Files/R/R-4.1.3/library")

#2번..########################################################

data <- read.table(iris$Sepal.Length, header = T)

ggplot(data, aes(cyl, cyl)) + geom_boxplot(varwidth = T, fill="red")

# 3번.########################################################
7 / 11

# 5번.########################################################

dnorm(5, mean = 5, sd = 6)

p1 <- pnorm(4, mean=5, sd = 6, lower.tail=T)
p2 <- pnorm(8, mean=5, sd = 6, lower.tail=T)
p <- p2 - p1
p


# 6번..########################################################

table <- read.table("c:/rData/eBest.txt", header =T, sep=" ")

m <- mean(table) 
sd <- sd(table)



# 7번.########################################################

MYDATA <- c(0.15, 0.21, 0.17, 0.19, 0.23, 0.29, 0.09, 0.18, 0.21, 0.18)
m <- mean(MYDATA)
sd <- sd(MYDATA)

t <- (0.2 - 0.19) / sd * sqrt(10)

pt(t, 9, lower.tail= T)
