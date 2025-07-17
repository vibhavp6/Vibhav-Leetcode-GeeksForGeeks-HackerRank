class Solution {
    // Function to calculate the highest power of k that divides n!
    public int maxKPower(int n, int k) {
        // Prime factorization of k
        Map<Integer, Integer> primeFactors = primeFactorize(k);
        
        int result = Integer.MAX_VALUE;
        
        // For each prime factor p of k
        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            int prime = entry.getKey();
            int exponent = entry.getValue();
            
            // Count the occurrences of prime in n!
            int count = countPrimeInFactorial(n, prime);
            
            // Calculate the maximum power of prime^exponent that divides n!
            result = Math.min(result, count / exponent);
        }
        
        return result;
    }
    
    // Function to perform prime factorization of k
    private Map<Integer, Integer> primeFactorize(int k) {
        Map<Integer, Integer> primeFactors = new HashMap<>();
        
        // Check for 2 as a factor first
        while (k % 2 == 0) {
            primeFactors.put(2, primeFactors.getOrDefault(2, 0) + 1);
            k /= 2;
        }
        
        // Check for odd factors
        for (int i = 3; i * i <= k; i += 2) {
            while (k % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                k /= i;
            }
        }
        
        // If k is still greater than 2, then it's prime
        if (k > 2) {
            primeFactors.put(k, primeFactors.getOrDefault(k, 0) + 1);
        }
        
        return primeFactors;
    }
    
    // Function to count the number of times prime appears in n!
    private int countPrimeInFactorial(int n, int prime) {
        int count = 0;
        for (long power = prime; power <= n; power *= prime) {
            count += n / power;
        }
        return count;
    }
}