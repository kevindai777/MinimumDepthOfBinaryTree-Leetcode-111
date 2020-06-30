//Objective is to find the minimum depth of a binary tree.


//O(n) solution that uses BFS and a queue.

//Base case
if (!root) {
    return 0
}

let queue = []
let level = 1

queue.push(root)

while (queue.length > 0) {
    //This is to break the next while loop
    queue.push(null)

    //Explore the children
    while (queue[0] !== null) {
        let node = queue.shift()

        if (!node.left && !node.right) {
            return level
        }
        if (node.left) {
            queue.push(node.left)
        }

        if (node.right) {
            queue.push(node.right)
        }
    }

    //Get rid of the 'null' and move onto the next level
    queue.shift()
    level++
}

return level