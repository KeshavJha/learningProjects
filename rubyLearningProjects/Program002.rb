# Declare constant variables with all capital variables
MYCONSTANT = 1
print MYCONSTANT
print "\n"

# Unlike Java and C , Ruby is not strong or static typed : hence doesn't need type of variable declared
# Ruby is dynamically typed language
# The type of variable can be changed later on

# MYCONSTANT = "hello"
# print MYCONSTANT



# Parallel assignment

a,b,c,d = 10,20,30,40

# equivalent to
# Not that the value is being changed here as well
a = 20
b = 30
c = 40
d = 50

print a
print "\n"
print b
print "\n"
print c
print "\n"
print d
print "\n"

# Identify the type of a vairable using
    # kind_of? method of Object class
print MYCONSTANT.kind_of? Integer
print "\n"

# OR print the class of variable
print MYCONSTANT.class
print "\n"
string = "hello"
print string.class
print "\n"

# Changing the type of the variable by assigning a value of new type
string = 220
print string
print "\n"
print string.class
print "\n"

# But the above is a destructive way of changing type of variables

# Another way to change variable type is to use inbuilt functions
a.to_f
print a
print "\n"
print a.class
print "\n"
print a.kind_of? Integer
print "\n"
print a.kind_of? Float
print "\n"


b.to_s
print b.class
print "\n"
b.kind_of? Integer
print "\n"
b.kind_of? String
print "\n"

# to_s(2) , to_s(16) , to_s(8) can be used to get binary , hexadecimal and octal representations of the number
