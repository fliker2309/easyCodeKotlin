class CacheDataSourceKotl<T> : MutableDataSource<T> {

    private var myData: T? = null
    override fun getData(): T? {
        return myData
    }

    override fun saveData(data: T) {
       myData = data
    }
}