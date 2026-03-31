let limit = 7;
let total = 0;

for (let i = 1; i <= limit; i += 2) {
  total += i * i * i;
}

console.log(total);