import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    if not data:
        return

    n = int(data[0])
    x = 0
    
    # Process each statement
    for i in range(1, n + 1):
        statement = data[i]
        if &#39;+&#39; in statement:
            x += 1
        else:
            x -= 1
            
    print(x)

if __name__ == &#39;__main__&#39;:
    main()
