package com.hzsoft.lib.net

import com.hzsoft.lib.net.dto.Demo
import com.hzsoft.lib.net.dto.Resource
import kotlinx.coroutines.flow.Flow


/**
 *
 * @author zhouhuan
 * @time 2020/12/1 0:21
 */
interface DataRepositorySource {
    suspend fun requestRecipes(): Flow<Resource<List<Demo>>>
    suspend fun doLogin(): Flow<Resource<String>>
    suspend fun removeFromFavourite(id: String): Flow<Resource<Boolean>>
}
