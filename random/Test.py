
print "Type the filename:"
file_name = raw_input("> ")
print "Here's your file %r:" % file_name

list = []
with open(file_name) as f:
	for line in f:
		line = line.strip()
		if not line:
			continue
		if line.startswith("@"):
			pass
		else:
			line = line.split(' ')
			line2 = [int(e) for e in line]
			list.append(line2)
i = 0
length = len(list)
while i < length:
	print list[i]
	i = i+1

