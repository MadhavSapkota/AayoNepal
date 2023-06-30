package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_ourdevelops_ourjek_models_RatingModelRealmProxy extends com.ourdevelops.ourjek.models.RatingModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface {

    static final class RatingModelColumnInfo extends ColumnInfo {
        long fotopelangganColKey;
        long fullnamaColKey;
        long update_atColKey;
        long catatanColKey;
        long ratingColKey;

        RatingModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RatingModel");
            this.fotopelangganColKey = addColumnDetails("fotopelanggan", "fotopelanggan", objectSchemaInfo);
            this.fullnamaColKey = addColumnDetails("fullnama", "fullnama", objectSchemaInfo);
            this.update_atColKey = addColumnDetails("update_at", "update_at", objectSchemaInfo);
            this.catatanColKey = addColumnDetails("catatan", "catatan", objectSchemaInfo);
            this.ratingColKey = addColumnDetails("rating", "rating", objectSchemaInfo);
        }

        RatingModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RatingModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RatingModelColumnInfo src = (RatingModelColumnInfo) rawSrc;
            final RatingModelColumnInfo dst = (RatingModelColumnInfo) rawDst;
            dst.fotopelangganColKey = src.fotopelangganColKey;
            dst.fullnamaColKey = src.fullnamaColKey;
            dst.update_atColKey = src.update_atColKey;
            dst.catatanColKey = src.catatanColKey;
            dst.ratingColKey = src.ratingColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RatingModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.RatingModel> proxyState;

    com_ourdevelops_ourjek_models_RatingModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RatingModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.RatingModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fotopelanggan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fotopelangganColKey);
    }

    @Override
    public void realmSet$fotopelanggan(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'fotopelanggan' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fullnama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fullnamaColKey);
    }

    @Override
    public void realmSet$fullnama(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fullnamaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fullnamaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fullnamaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fullnamaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$update_at() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.update_atColKey);
    }

    @Override
    public void realmSet$update_at(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.update_atColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.update_atColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.update_atColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.update_atColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$catatan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.catatanColKey);
    }

    @Override
    public void realmSet$catatan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.catatanColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.catatanColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.catatanColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.catatanColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$rating() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ratingColKey);
    }

    @Override
    public void realmSet$rating(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ratingColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ratingColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ratingColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ratingColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RatingModel", 5, 0);
        builder.addPersistedProperty("fotopelanggan", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fullnama", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("update_at", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("catatan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("rating", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RatingModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RatingModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RatingModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RatingModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.RatingModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.RatingModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
            RatingModelColumnInfo columnInfo = (RatingModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class);
            long pkColumnKey = columnInfo.fotopelangganColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("fotopelanggan")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("fotopelanggan"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("fotopelanggan")) {
                if (json.isNull("fotopelanggan")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.RatingModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.RatingModel.class, json.getString("fotopelanggan"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'fotopelanggan'.");
            }
        }

        final com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) obj;
        if (json.has("fullnama")) {
            if (json.isNull("fullnama")) {
                objProxy.realmSet$fullnama(null);
            } else {
                objProxy.realmSet$fullnama((String) json.getString("fullnama"));
            }
        }
        if (json.has("update_at")) {
            if (json.isNull("update_at")) {
                objProxy.realmSet$update_at(null);
            } else {
                objProxy.realmSet$update_at((String) json.getString("update_at"));
            }
        }
        if (json.has("catatan")) {
            if (json.isNull("catatan")) {
                objProxy.realmSet$catatan(null);
            } else {
                objProxy.realmSet$catatan((String) json.getString("catatan"));
            }
        }
        if (json.has("rating")) {
            if (json.isNull("rating")) {
                objProxy.realmSet$rating(null);
            } else {
                objProxy.realmSet$rating((String) json.getString("rating"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.RatingModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.RatingModel obj = new com.ourdevelops.ourjek.models.RatingModel();
        final com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("fotopelanggan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fotopelanggan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fotopelanggan(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("fullnama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fullnama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fullnama(null);
                }
            } else if (name.equals("update_at")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$update_at((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$update_at(null);
                }
            } else if (name.equals("catatan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$catatan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$catatan(null);
                }
            } else if (name.equals("rating")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rating((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rating(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'fotopelanggan'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_RatingModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.RatingModel copyOrUpdate(Realm realm, RatingModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.RatingModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.RatingModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.RatingModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
            long pkColumnKey = columnInfo.fotopelangganColKey;
            String value = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fotopelanggan();
            long colKey = Table.NO_MATCH;
            if (value == null) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, value);
            }
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.RatingModel copy(Realm realm, RatingModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.RatingModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.RatingModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.fotopelangganColKey, realmObjectSource.realmGet$fotopelanggan());
        builder.addString(columnInfo.fullnamaColKey, realmObjectSource.realmGet$fullnama());
        builder.addString(columnInfo.update_atColKey, realmObjectSource.realmGet$update_at());
        builder.addString(columnInfo.catatanColKey, realmObjectSource.realmGet$catatan());
        builder.addString(columnInfo.ratingColKey, realmObjectSource.realmGet$rating());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_RatingModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.RatingModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
        long tableNativePtr = table.getNativePtr();
        RatingModelColumnInfo columnInfo = (RatingModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class);
        long pkColumnKey = columnInfo.fotopelangganColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fotopelanggan();
        long colKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$fullnama = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fullnama();
        if (realmGet$fullnama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
        }
        String realmGet$update_at = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$update_at();
        if (realmGet$update_at != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.update_atColKey, colKey, realmGet$update_at, false);
        }
        String realmGet$catatan = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$catatan();
        if (realmGet$catatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
        }
        String realmGet$rating = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
        long tableNativePtr = table.getNativePtr();
        RatingModelColumnInfo columnInfo = (RatingModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class);
        long pkColumnKey = columnInfo.fotopelangganColKey;
        com.ourdevelops.ourjek.models.RatingModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.RatingModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fotopelanggan();
            long colKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$fullnama = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fullnama();
            if (realmGet$fullnama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
            }
            String realmGet$update_at = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$update_at();
            if (realmGet$update_at != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.update_atColKey, colKey, realmGet$update_at, false);
            }
            String realmGet$catatan = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$catatan();
            if (realmGet$catatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
            }
            String realmGet$rating = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$rating();
            if (realmGet$rating != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.RatingModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
        long tableNativePtr = table.getNativePtr();
        RatingModelColumnInfo columnInfo = (RatingModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class);
        long pkColumnKey = columnInfo.fotopelangganColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fotopelanggan();
        long colKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$fullnama = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fullnama();
        if (realmGet$fullnama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fullnamaColKey, colKey, false);
        }
        String realmGet$update_at = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$update_at();
        if (realmGet$update_at != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.update_atColKey, colKey, realmGet$update_at, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.update_atColKey, colKey, false);
        }
        String realmGet$catatan = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$catatan();
        if (realmGet$catatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.catatanColKey, colKey, false);
        }
        String realmGet$rating = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ratingColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
        long tableNativePtr = table.getNativePtr();
        RatingModelColumnInfo columnInfo = (RatingModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.RatingModel.class);
        long pkColumnKey = columnInfo.fotopelangganColKey;
        com.ourdevelops.ourjek.models.RatingModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.RatingModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fotopelanggan();
            long colKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$fullnama = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$fullnama();
            if (realmGet$fullnama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fullnamaColKey, colKey, false);
            }
            String realmGet$update_at = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$update_at();
            if (realmGet$update_at != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.update_atColKey, colKey, realmGet$update_at, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.update_atColKey, colKey, false);
            }
            String realmGet$catatan = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$catatan();
            if (realmGet$catatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.catatanColKey, colKey, false);
            }
            String realmGet$rating = ((com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) object).realmGet$rating();
            if (realmGet$rating != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ratingColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.RatingModel createDetachedCopy(com.ourdevelops.ourjek.models.RatingModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.RatingModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.RatingModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.RatingModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.RatingModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$fotopelanggan(realmSource.realmGet$fotopelanggan());
        unmanagedCopy.realmSet$fullnama(realmSource.realmGet$fullnama());
        unmanagedCopy.realmSet$update_at(realmSource.realmGet$update_at());
        unmanagedCopy.realmSet$catatan(realmSource.realmGet$catatan());
        unmanagedCopy.realmSet$rating(realmSource.realmGet$rating());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.RatingModel update(Realm realm, RatingModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.RatingModel realmObject, com.ourdevelops.ourjek.models.RatingModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_RatingModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.RatingModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.fotopelangganColKey, realmObjectSource.realmGet$fotopelanggan());
        builder.addString(columnInfo.fullnamaColKey, realmObjectSource.realmGet$fullnama());
        builder.addString(columnInfo.update_atColKey, realmObjectSource.realmGet$update_at());
        builder.addString(columnInfo.catatanColKey, realmObjectSource.realmGet$catatan());
        builder.addString(columnInfo.ratingColKey, realmObjectSource.realmGet$rating());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RatingModel = proxy[");
        stringBuilder.append("{fotopelanggan:");
        stringBuilder.append(realmGet$fotopelanggan() != null ? realmGet$fotopelanggan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fullnama:");
        stringBuilder.append(realmGet$fullnama() != null ? realmGet$fullnama() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{update_at:");
        stringBuilder.append(realmGet$update_at() != null ? realmGet$update_at() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{catatan:");
        stringBuilder.append(realmGet$catatan() != null ? realmGet$catatan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rating:");
        stringBuilder.append(realmGet$rating() != null ? realmGet$rating() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long colKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (colKey ^ (colKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_ourdevelops_ourjek_models_RatingModelRealmProxy aRatingModel = (com_ourdevelops_ourjek_models_RatingModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRatingModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRatingModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRatingModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
