package com.keshavindustryfsmfsm.features.newcollection.model

import com.keshavindustryfsmfsm.app.domain.CollectionDetailsEntity
import com.keshavindustryfsmfsm.base.BaseResponse
import com.keshavindustryfsmfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}