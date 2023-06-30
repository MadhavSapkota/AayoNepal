package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(26);
        modelClasses.add(com.ourdevelops.ourjek.models.BankModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.FiturDataModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.ItemModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.BeritaModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.PesananMerchant.class);
        modelClasses.add(com.ourdevelops.ourjek.models.MerchantModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.PayuModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.CatItemModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.FavouriteModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.RatingModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.User.class);
        modelClasses.add(com.ourdevelops.ourjek.models.FiturModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.AllFiturModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.VehicleModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.FirebaseToken.class);
        modelClasses.add(com.ourdevelops.ourjek.models.DriverModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.MessageModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.WalletModel.class);
        modelClasses.add(com.ourdevelops.ourjek.models.TransaksiModel.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(26);
        infoMap.put(com.ourdevelops.ourjek.models.BankModel.class, io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.FiturDataModel.class, io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.ItemModel.class, io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.BeritaModel.class, io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.PesananMerchant.class, io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.MerchantModel.class, io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.PayuModel.class, io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.CatItemModel.class, io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.FavouriteModel.class, io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.RatingModel.class, io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.User.class, io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.FiturModel.class, io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.AllTransaksiModel.class, io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.TransaksiSendModel.class, io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.MerchantNearModel.class, io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.AllFiturModel.class, io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.VehicleModel.class, io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.CatMerchantModel.class, io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.FirebaseToken.class, io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.DriverModel.class, io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.ItemPesananModel.class, io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.LocalLocationModel.class, io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.MessageModel.class, io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.DiskonWalletModel.class, io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.WalletModel.class, io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ourjek.models.TransaksiModel.class, io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            return io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            return io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            return io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            return io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            return "BankModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            return "FiturDataModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            return "ItemModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            return "BeritaModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            return "PesananMerchant";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            return "MerchantModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            return "PayuModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            return "CatItemModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            return "FavouriteModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            return "RatingModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            return "User";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            return "FiturModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            return "AllTransaksiModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            return "TransaksiSendModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            return "MerchantNearModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            return "AllFiturModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            return "VehicleModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            return "CatMerchantModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            return "FirebaseToken";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            return "DriverModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            return "ItemPesananModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            return "LocalLocationModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            return "MessageModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            return "DiskonWalletModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            return "WalletModel";
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            return "TransaksiModel";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_UserRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            com_ourdevelops_ourjek_models_BankModelRealmProxy.BankModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_BankModelRealmProxy.BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.BankModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.FiturDataModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.FiturDataModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturDataModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.FiturDataModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            com_ourdevelops_ourjek_models_ItemModelRealmProxy.ItemModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_ItemModelRealmProxy.ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.ItemModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            com_ourdevelops_ourjek_models_BeritaModelRealmProxy.BeritaModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_BeritaModelRealmProxy.BeritaModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.BeritaModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.PesananMerchantColumnInfo columnInfo = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.PesananMerchantColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.PesananMerchant) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            com_ourdevelops_ourjek_models_MerchantModelRealmProxy.MerchantModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_MerchantModelRealmProxy.MerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.MerchantModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            com_ourdevelops_ourjek_models_PayuModelRealmProxy.PayuModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_PayuModelRealmProxy.PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.PayuModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            com_ourdevelops_ourjek_models_CatItemModelRealmProxy.CatItemModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_CatItemModelRealmProxy.CatItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.CatItemModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.FavouriteModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.FavouriteModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FavouriteModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.FavouriteModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            com_ourdevelops_ourjek_models_RatingModelRealmProxy.RatingModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_RatingModelRealmProxy.RatingModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.RatingModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            com_ourdevelops_ourjek_models_UserRealmProxy.UserColumnInfo columnInfo = (com_ourdevelops_ourjek_models_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.User) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            com_ourdevelops_ourjek_models_FiturModelRealmProxy.FiturModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_FiturModelRealmProxy.FiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.FiturModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.AllTransaksiModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.AllTransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.AllTransaksiModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.TransaksiSendModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.TransaksiSendModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.TransaksiSendModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.MerchantNearModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.MerchantNearModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.MerchantNearModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.AllFiturModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.AllFiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllFiturModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.AllFiturModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            com_ourdevelops_ourjek_models_VehicleModelRealmProxy.VehicleModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_VehicleModelRealmProxy.VehicleModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.VehicleModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.CatMerchantModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.CatMerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.CatMerchantModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.FirebaseTokenColumnInfo columnInfo = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.FirebaseTokenColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FirebaseToken.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.FirebaseToken) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            com_ourdevelops_ourjek_models_DriverModelRealmProxy.DriverModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_DriverModelRealmProxy.DriverModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DriverModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.DriverModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.ItemPesananModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.ItemPesananModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemPesananModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.ItemPesananModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.LocalLocationModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.LocalLocationModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.LocalLocationModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.LocalLocationModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            com_ourdevelops_ourjek_models_MessageModelRealmProxy.MessageModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_MessageModelRealmProxy.MessageModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MessageModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.MessageModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.DiskonWalletModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.DiskonWalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.DiskonWalletModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            com_ourdevelops_ourjek_models_WalletModelRealmProxy.WalletModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_WalletModelRealmProxy.WalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.WalletModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.WalletModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.TransaksiModelColumnInfo columnInfo = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.TransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ourjek.models.TransaksiModel) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.BankModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FiturDataModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.ItemModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.BeritaModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.PesananMerchant) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.MerchantModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.PayuModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.CatItemModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FavouriteModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.RatingModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.User) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FiturModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.AllTransaksiModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.TransaksiSendModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.MerchantNearModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.AllFiturModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.VehicleModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.CatMerchantModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FirebaseToken) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.DriverModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.ItemPesananModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.LocalLocationModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.MessageModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.DiskonWalletModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.WalletModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.TransaksiModel) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.BankModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FiturDataModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.ItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.BeritaModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
                io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.PesananMerchant) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.MerchantModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.PayuModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.CatItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FavouriteModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.RatingModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
                io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.User) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FiturModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.AllTransaksiModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.TransaksiSendModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.MerchantNearModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.AllFiturModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.VehicleModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.CatMerchantModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
                io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.FirebaseToken) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.DriverModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.ItemPesananModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.LocalLocationModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.MessageModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.DiskonWalletModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.WalletModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.insert(realm, (com.ourdevelops.ourjek.models.TransaksiModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
                    io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
                    io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.BankModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FiturDataModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.ItemModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.BeritaModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.PesananMerchant) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.MerchantModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.PayuModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.CatItemModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FavouriteModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.RatingModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.User) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FiturModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.AllTransaksiModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.TransaksiSendModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.MerchantNearModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.AllFiturModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.VehicleModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.CatMerchantModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FirebaseToken) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.DriverModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.ItemPesananModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.LocalLocationModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.MessageModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.DiskonWalletModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.WalletModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.TransaksiModel) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.BankModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FiturDataModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.ItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.BeritaModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
                io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.PesananMerchant) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.MerchantModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.PayuModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.CatItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FavouriteModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.RatingModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
                io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.User) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FiturModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.AllTransaksiModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.TransaksiSendModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.MerchantNearModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.AllFiturModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.VehicleModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.CatMerchantModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
                io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.FirebaseToken) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.DriverModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.ItemPesananModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.LocalLocationModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.MessageModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.DiskonWalletModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.WalletModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
                io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ourjek.models.TransaksiModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
                    io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
                    io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
                    io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
                    io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.ourdevelops.ourjek.models.BankModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.BankModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturDataModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturDataModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.FiturDataModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.ItemModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.BeritaModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.BeritaModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PesananMerchant.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.PesananMerchant) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.MerchantModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.PayuModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.PayuModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.CatItemModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FavouriteModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FavouriteModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.FavouriteModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.RatingModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.RatingModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.User.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_UserRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FiturModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.FiturModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllTransaksiModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.AllTransaksiModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiSendModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.TransaksiSendModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MerchantNearModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.MerchantNearModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.AllFiturModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_AllFiturModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.AllFiturModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.VehicleModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.VehicleModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.CatMerchantModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.CatMerchantModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.FirebaseToken.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.FirebaseToken) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DriverModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.DriverModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.ItemPesananModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.ItemPesananModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.LocalLocationModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.LocalLocationModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.MessageModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_MessageModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.MessageModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.DiskonWalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.DiskonWalletModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.WalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_WalletModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.WalletModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ourjek.models.TransaksiModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy.createDetachedCopy((com.ourdevelops.ourjek.models.TransaksiModel) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
