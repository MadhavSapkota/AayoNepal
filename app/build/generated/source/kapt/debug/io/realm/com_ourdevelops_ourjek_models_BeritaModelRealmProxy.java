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
public class com_ourdevelops_ourjek_models_BeritaModelRealmProxy extends com.ourdevelops.ourjek.models.BeritaModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface {

    static final class BeritaModelColumnInfo extends ColumnInfo {
        long id_beritaColKey;
        long idMerchantColKey;
        long titleColKey;
        long contentColKey;
        long foto_beritaColKey;
        long created_beritaColKey;
        long kategoriColKey;

        BeritaModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BeritaModel");
            this.id_beritaColKey = addColumnDetails("id_berita", "id_berita", objectSchemaInfo);
            this.idMerchantColKey = addColumnDetails("idMerchant", "idMerchant", objectSchemaInfo);
            this.titleColKey = addColumnDetails("title", "title", objectSchemaInfo);
            this.contentColKey = addColumnDetails("content", "content", objectSchemaInfo);
            this.foto_beritaColKey = addColumnDetails("foto_berita", "foto_berita", objectSchemaInfo);
            this.created_beritaColKey = addColumnDetails("created_berita", "created_berita", objectSchemaInfo);
            this.kategoriColKey = addColumnDetails("kategori", "kategori", objectSchemaInfo);
        }

        BeritaModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BeritaModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BeritaModelColumnInfo src = (BeritaModelColumnInfo) rawSrc;
            final BeritaModelColumnInfo dst = (BeritaModelColumnInfo) rawDst;
            dst.id_beritaColKey = src.id_beritaColKey;
            dst.idMerchantColKey = src.idMerchantColKey;
            dst.titleColKey = src.titleColKey;
            dst.contentColKey = src.contentColKey;
            dst.foto_beritaColKey = src.foto_beritaColKey;
            dst.created_beritaColKey = src.created_beritaColKey;
            dst.kategoriColKey = src.kategoriColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private BeritaModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.BeritaModel> proxyState;

    com_ourdevelops_ourjek_models_BeritaModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BeritaModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.BeritaModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id_berita() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_beritaColKey);
    }

    @Override
    public void realmSet$id_berita(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id_berita' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idMerchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idMerchantColKey);
    }

    @Override
    public void realmSet$idMerchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idMerchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idMerchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idMerchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idMerchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleColKey);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.titleColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.titleColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.titleColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.titleColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$content() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentColKey);
    }

    @Override
    public void realmSet$content(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contentColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.contentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contentColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contentColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$foto_berita() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.foto_beritaColKey);
    }

    @Override
    public void realmSet$foto_berita(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.foto_beritaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.foto_beritaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.foto_beritaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.foto_beritaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$created_berita() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.created_beritaColKey);
    }

    @Override
    public void realmSet$created_berita(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.created_beritaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.created_beritaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.created_beritaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.created_beritaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kategori() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kategoriColKey);
    }

    @Override
    public void realmSet$kategori(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kategoriColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.kategoriColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kategoriColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kategoriColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BeritaModel", 7, 0);
        builder.addPersistedProperty("id_berita", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idMerchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("foto_berita", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("created_berita", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kategori", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BeritaModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BeritaModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BeritaModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BeritaModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.BeritaModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.BeritaModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
            BeritaModelColumnInfo columnInfo = (BeritaModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class);
            long pkColumnKey = columnInfo.id_beritaColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("id_berita")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("id_berita"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id_berita")) {
                if (json.isNull("id_berita")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.BeritaModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.BeritaModel.class, json.getString("id_berita"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_berita'.");
            }
        }

        final com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) obj;
        if (json.has("idMerchant")) {
            if (json.isNull("idMerchant")) {
                objProxy.realmSet$idMerchant(null);
            } else {
                objProxy.realmSet$idMerchant((String) json.getString("idMerchant"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                objProxy.realmSet$content(null);
            } else {
                objProxy.realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("foto_berita")) {
            if (json.isNull("foto_berita")) {
                objProxy.realmSet$foto_berita(null);
            } else {
                objProxy.realmSet$foto_berita((String) json.getString("foto_berita"));
            }
        }
        if (json.has("created_berita")) {
            if (json.isNull("created_berita")) {
                objProxy.realmSet$created_berita(null);
            } else {
                objProxy.realmSet$created_berita((String) json.getString("created_berita"));
            }
        }
        if (json.has("kategori")) {
            if (json.isNull("kategori")) {
                objProxy.realmSet$kategori(null);
            } else {
                objProxy.realmSet$kategori((String) json.getString("kategori"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.BeritaModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.BeritaModel obj = new com.ourdevelops.ourjek.models.BeritaModel();
        final com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id_berita")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_berita((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_berita(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("idMerchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idMerchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idMerchant(null);
                }
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
            } else if (name.equals("content")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$content((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$content(null);
                }
            } else if (name.equals("foto_berita")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$foto_berita((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$foto_berita(null);
                }
            } else if (name.equals("created_berita")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$created_berita((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$created_berita(null);
                }
            } else if (name.equals("kategori")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kategori((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kategori(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_berita'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_BeritaModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.BeritaModel copyOrUpdate(Realm realm, BeritaModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.BeritaModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.BeritaModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.BeritaModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
            long pkColumnKey = columnInfo.id_beritaColKey;
            String value = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$id_berita();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.BeritaModel copy(Realm realm, BeritaModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.BeritaModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.BeritaModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.id_beritaColKey, realmObjectSource.realmGet$id_berita());
        builder.addString(columnInfo.idMerchantColKey, realmObjectSource.realmGet$idMerchant());
        builder.addString(columnInfo.titleColKey, realmObjectSource.realmGet$title());
        builder.addString(columnInfo.contentColKey, realmObjectSource.realmGet$content());
        builder.addString(columnInfo.foto_beritaColKey, realmObjectSource.realmGet$foto_berita());
        builder.addString(columnInfo.created_beritaColKey, realmObjectSource.realmGet$created_berita());
        builder.addString(columnInfo.kategoriColKey, realmObjectSource.realmGet$kategori());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_BeritaModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.BeritaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
        long tableNativePtr = table.getNativePtr();
        BeritaModelColumnInfo columnInfo = (BeritaModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class);
        long pkColumnKey = columnInfo.id_beritaColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$id_berita();
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
        String realmGet$idMerchant = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$idMerchant();
        if (realmGet$idMerchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idMerchantColKey, colKey, realmGet$idMerchant, false);
        }
        String realmGet$title = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, colKey, realmGet$title, false);
        }
        String realmGet$content = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, colKey, realmGet$content, false);
        }
        String realmGet$foto_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$foto_berita();
        if (realmGet$foto_berita != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_beritaColKey, colKey, realmGet$foto_berita, false);
        }
        String realmGet$created_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$created_berita();
        if (realmGet$created_berita != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.created_beritaColKey, colKey, realmGet$created_berita, false);
        }
        String realmGet$kategori = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$kategori();
        if (realmGet$kategori != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kategoriColKey, colKey, realmGet$kategori, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
        long tableNativePtr = table.getNativePtr();
        BeritaModelColumnInfo columnInfo = (BeritaModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class);
        long pkColumnKey = columnInfo.id_beritaColKey;
        com.ourdevelops.ourjek.models.BeritaModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.BeritaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$id_berita();
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
            String realmGet$idMerchant = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$idMerchant();
            if (realmGet$idMerchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idMerchantColKey, colKey, realmGet$idMerchant, false);
            }
            String realmGet$title = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, colKey, realmGet$title, false);
            }
            String realmGet$content = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, colKey, realmGet$content, false);
            }
            String realmGet$foto_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$foto_berita();
            if (realmGet$foto_berita != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_beritaColKey, colKey, realmGet$foto_berita, false);
            }
            String realmGet$created_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$created_berita();
            if (realmGet$created_berita != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.created_beritaColKey, colKey, realmGet$created_berita, false);
            }
            String realmGet$kategori = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$kategori();
            if (realmGet$kategori != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kategoriColKey, colKey, realmGet$kategori, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.BeritaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
        long tableNativePtr = table.getNativePtr();
        BeritaModelColumnInfo columnInfo = (BeritaModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class);
        long pkColumnKey = columnInfo.id_beritaColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$id_berita();
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
        String realmGet$idMerchant = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$idMerchant();
        if (realmGet$idMerchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idMerchantColKey, colKey, realmGet$idMerchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idMerchantColKey, colKey, false);
        }
        String realmGet$title = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, colKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleColKey, colKey, false);
        }
        String realmGet$content = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, colKey, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, colKey, false);
        }
        String realmGet$foto_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$foto_berita();
        if (realmGet$foto_berita != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_beritaColKey, colKey, realmGet$foto_berita, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.foto_beritaColKey, colKey, false);
        }
        String realmGet$created_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$created_berita();
        if (realmGet$created_berita != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.created_beritaColKey, colKey, realmGet$created_berita, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.created_beritaColKey, colKey, false);
        }
        String realmGet$kategori = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$kategori();
        if (realmGet$kategori != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kategoriColKey, colKey, realmGet$kategori, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kategoriColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
        long tableNativePtr = table.getNativePtr();
        BeritaModelColumnInfo columnInfo = (BeritaModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BeritaModel.class);
        long pkColumnKey = columnInfo.id_beritaColKey;
        com.ourdevelops.ourjek.models.BeritaModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.BeritaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$id_berita();
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
            String realmGet$idMerchant = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$idMerchant();
            if (realmGet$idMerchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idMerchantColKey, colKey, realmGet$idMerchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idMerchantColKey, colKey, false);
            }
            String realmGet$title = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleColKey, colKey, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleColKey, colKey, false);
            }
            String realmGet$content = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, colKey, realmGet$content, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, colKey, false);
            }
            String realmGet$foto_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$foto_berita();
            if (realmGet$foto_berita != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_beritaColKey, colKey, realmGet$foto_berita, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.foto_beritaColKey, colKey, false);
            }
            String realmGet$created_berita = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$created_berita();
            if (realmGet$created_berita != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.created_beritaColKey, colKey, realmGet$created_berita, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.created_beritaColKey, colKey, false);
            }
            String realmGet$kategori = ((com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) object).realmGet$kategori();
            if (realmGet$kategori != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kategoriColKey, colKey, realmGet$kategori, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kategoriColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.BeritaModel createDetachedCopy(com.ourdevelops.ourjek.models.BeritaModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.BeritaModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.BeritaModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.BeritaModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.BeritaModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id_berita(realmSource.realmGet$id_berita());
        unmanagedCopy.realmSet$idMerchant(realmSource.realmGet$idMerchant());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$content(realmSource.realmGet$content());
        unmanagedCopy.realmSet$foto_berita(realmSource.realmGet$foto_berita());
        unmanagedCopy.realmSet$created_berita(realmSource.realmGet$created_berita());
        unmanagedCopy.realmSet$kategori(realmSource.realmGet$kategori());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.BeritaModel update(Realm realm, BeritaModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.BeritaModel realmObject, com.ourdevelops.ourjek.models.BeritaModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_BeritaModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BeritaModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.id_beritaColKey, realmObjectSource.realmGet$id_berita());
        builder.addString(columnInfo.idMerchantColKey, realmObjectSource.realmGet$idMerchant());
        builder.addString(columnInfo.titleColKey, realmObjectSource.realmGet$title());
        builder.addString(columnInfo.contentColKey, realmObjectSource.realmGet$content());
        builder.addString(columnInfo.foto_beritaColKey, realmObjectSource.realmGet$foto_berita());
        builder.addString(columnInfo.created_beritaColKey, realmObjectSource.realmGet$created_berita());
        builder.addString(columnInfo.kategoriColKey, realmObjectSource.realmGet$kategori());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BeritaModel = proxy[");
        stringBuilder.append("{id_berita:");
        stringBuilder.append(realmGet$id_berita() != null ? realmGet$id_berita() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idMerchant:");
        stringBuilder.append(realmGet$idMerchant() != null ? realmGet$idMerchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title() != null ? realmGet$title() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{content:");
        stringBuilder.append(realmGet$content() != null ? realmGet$content() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{foto_berita:");
        stringBuilder.append(realmGet$foto_berita() != null ? realmGet$foto_berita() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{created_berita:");
        stringBuilder.append(realmGet$created_berita() != null ? realmGet$created_berita() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kategori:");
        stringBuilder.append(realmGet$kategori() != null ? realmGet$kategori() : "null");
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
        com_ourdevelops_ourjek_models_BeritaModelRealmProxy aBeritaModel = (com_ourdevelops_ourjek_models_BeritaModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aBeritaModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBeritaModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aBeritaModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
