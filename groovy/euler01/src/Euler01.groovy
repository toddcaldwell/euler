class Euler01 {
    static void main(String[] args) {
        println ((0..999).step(3).plus((0..999).step(5)).unique().sum())
    }
}
