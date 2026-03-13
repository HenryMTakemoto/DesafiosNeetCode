// Desafio do TwoSum, verificar se no array existe a soma de dois elementos cujo resultado seja o target
// se existir retornar os indices desses elementos

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numeros = new HashMap<>();  // HashMap para ter retorno do indice depois

        for (int i = 0 ; i < nums.length ; i++ ){
            int num = nums[i];
            int complemento = target - num;
            if(numeros.containsKey(complemento)){ // Verifica se o complemento da soma pro target existe no Hash
                int indiceComplemento = numeros.get(complemento);
                return new int[]{indiceComplemento, i};
            }
            numeros.put(num, i); 
        }
        return new int[]{};
    }

}
