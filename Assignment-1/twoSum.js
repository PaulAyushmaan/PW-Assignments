let arr=[2,7,11,15]
let result=[]
const target=9
console.log(`Printing Arrays 
${arr}`)
for (let i = 0; i < arr.length; i++) {
    for (let j = i+1; j < arr.length; j++) {
        if (arr[i]+arr[j]==target) {
            result.push(i)
            result.push(j)
        }
    }
}
console.log(result);