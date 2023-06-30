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
public class com_ourdevelops_ourjek_models_PayuModelRealmProxy extends com.ourdevelops.ourjek.models.PayuModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface {

    static final class PayuModelColumnInfo extends ColumnInfo {
        long idColKey;
        long payukeyColKey;
        long payuidColKey;
        long payusaltColKey;
        long payudebugColKey;
        long activeColKey;

        PayuModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PayuModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.payukeyColKey = addColumnDetails("payukey", "payukey", objectSchemaInfo);
            this.payuidColKey = addColumnDetails("payuid", "payuid", objectSchemaInfo);
            this.payusaltColKey = addColumnDetails("payusalt", "payusalt", objectSchemaInfo);
            this.payudebugColKey = addColumnDetails("payudebug", "payudebug", objectSchemaInfo);
            this.activeColKey = addColumnDetails("active", "active", objectSchemaInfo);
        }

        PayuModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PayuModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PayuModelColumnInfo src = (PayuModelColumnInfo) rawSrc;
            final PayuModelColumnInfo dst = (PayuModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.payukeyColKey = src.payukeyColKey;
            dst.payuidColKey = src.payuidColKey;
            dst.payusaltColKey = src.payusaltColKey;
            dst.payudebugColKey = src.payudebugColKey;
            dst.activeColKey = src.activeColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PayuModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.PayuModel> proxyState;

    com_ourdevelops_ourjek_models_PayuModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PayuModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.PayuModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$payukey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.payukeyColKey);
    }

    @Override
    public void realmSet$payukey(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.payukeyColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.payukeyColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.payukeyColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.payukeyColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$payuid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.payuidColKey);
    }

    @Override
    public void realmSet$payuid(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.payuidColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.payuidColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.payuidColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.payuidColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$payusalt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.payusaltColKey);
    }

    @Override
    public void realmSet$payusalt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.payusaltColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.payusaltColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.payusaltColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.payusaltColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$payudebug() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.payudebugColKey);
    }

    @Override
    public void realmSet$payudebug(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.payudebugColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.payudebugColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.payudebugColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.payudebugColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$active() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.activeColKey);
    }

    @Override
    public void realmSet$active(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.activeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.activeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.activeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.activeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PayuModel", 6, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("payukey", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("payuid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("payusalt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("payudebug", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("active", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PayuModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PayuModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PayuModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PayuModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.PayuModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.PayuModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
            PayuModelColumnInfo columnInfo = (PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.PayuModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.PayuModel.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) obj;
        if (json.has("payukey")) {
            if (json.isNull("payukey")) {
                objProxy.realmSet$payukey(null);
            } else {
                objProxy.realmSet$payukey((String) json.getString("payukey"));
            }
        }
        if (json.has("payuid")) {
            if (json.isNull("payuid")) {
                objProxy.realmSet$payuid(null);
            } else {
                objProxy.realmSet$payuid((String) json.getString("payuid"));
            }
        }
        if (json.has("payusalt")) {
            if (json.isNull("payusalt")) {
                objProxy.realmSet$payusalt(null);
            } else {
                objProxy.realmSet$payusalt((String) json.getString("payusalt"));
            }
        }
        if (json.has("payudebug")) {
            if (json.isNull("payudebug")) {
                objProxy.realmSet$payudebug(null);
            } else {
                objProxy.realmSet$payudebug((String) json.getString("payudebug"));
            }
        }
        if (json.has("active")) {
            if (json.isNull("active")) {
                objProxy.realmSet$active(null);
            } else {
                objProxy.realmSet$active((String) json.getString("active"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.PayuModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.PayuModel obj = new com.ourdevelops.ourjek.models.PayuModel();
        final com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("payukey")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$payukey((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$payukey(null);
                }
            } else if (name.equals("payuid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$payuid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$payuid(null);
                }
            } else if (name.equals("payusalt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$payusalt((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$payusalt(null);
                }
            } else if (name.equals("payudebug")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$payudebug((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$payudebug(null);
                }
            } else if (name.equals("active")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$active((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$active(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_PayuModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.PayuModel copyOrUpdate(Realm realm, PayuModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.PayuModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.PayuModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.PayuModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.PayuModel copy(Realm realm, PayuModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.PayuModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.PayuModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.payukeyColKey, realmObjectSource.realmGet$payukey());
        builder.addString(columnInfo.payuidColKey, realmObjectSource.realmGet$payuid());
        builder.addString(columnInfo.payusaltColKey, realmObjectSource.realmGet$payusalt());
        builder.addString(columnInfo.payudebugColKey, realmObjectSource.realmGet$payudebug());
        builder.addString(columnInfo.activeColKey, realmObjectSource.realmGet$active());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_PayuModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.PayuModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
        long tableNativePtr = table.getNativePtr();
        PayuModelColumnInfo columnInfo = (PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$payukey = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payukey();
        if (realmGet$payukey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payukeyColKey, colKey, realmGet$payukey, false);
        }
        String realmGet$payuid = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payuid();
        if (realmGet$payuid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payuidColKey, colKey, realmGet$payuid, false);
        }
        String realmGet$payusalt = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payusalt();
        if (realmGet$payusalt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payusaltColKey, colKey, realmGet$payusalt, false);
        }
        String realmGet$payudebug = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payudebug();
        if (realmGet$payudebug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payudebugColKey, colKey, realmGet$payudebug, false);
        }
        String realmGet$active = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$active();
        if (realmGet$active != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.activeColKey, colKey, realmGet$active, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
        long tableNativePtr = table.getNativePtr();
        PayuModelColumnInfo columnInfo = (PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.PayuModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.PayuModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$payukey = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payukey();
            if (realmGet$payukey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payukeyColKey, colKey, realmGet$payukey, false);
            }
            String realmGet$payuid = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payuid();
            if (realmGet$payuid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payuidColKey, colKey, realmGet$payuid, false);
            }
            String realmGet$payusalt = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payusalt();
            if (realmGet$payusalt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payusaltColKey, colKey, realmGet$payusalt, false);
            }
            String realmGet$payudebug = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payudebug();
            if (realmGet$payudebug != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payudebugColKey, colKey, realmGet$payudebug, false);
            }
            String realmGet$active = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$active();
            if (realmGet$active != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.activeColKey, colKey, realmGet$active, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.PayuModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
        long tableNativePtr = table.getNativePtr();
        PayuModelColumnInfo columnInfo = (PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, colKey);
        String realmGet$payukey = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payukey();
        if (realmGet$payukey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payukeyColKey, colKey, realmGet$payukey, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.payukeyColKey, colKey, false);
        }
        String realmGet$payuid = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payuid();
        if (realmGet$payuid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payuidColKey, colKey, realmGet$payuid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.payuidColKey, colKey, false);
        }
        String realmGet$payusalt = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payusalt();
        if (realmGet$payusalt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payusaltColKey, colKey, realmGet$payusalt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.payusaltColKey, colKey, false);
        }
        String realmGet$payudebug = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payudebug();
        if (realmGet$payudebug != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.payudebugColKey, colKey, realmGet$payudebug, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.payudebugColKey, colKey, false);
        }
        String realmGet$active = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$active();
        if (realmGet$active != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.activeColKey, colKey, realmGet$active, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.activeColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
        long tableNativePtr = table.getNativePtr();
        PayuModelColumnInfo columnInfo = (PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PayuModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.PayuModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.PayuModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, colKey);
            String realmGet$payukey = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payukey();
            if (realmGet$payukey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payukeyColKey, colKey, realmGet$payukey, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.payukeyColKey, colKey, false);
            }
            String realmGet$payuid = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payuid();
            if (realmGet$payuid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payuidColKey, colKey, realmGet$payuid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.payuidColKey, colKey, false);
            }
            String realmGet$payusalt = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payusalt();
            if (realmGet$payusalt != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payusaltColKey, colKey, realmGet$payusalt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.payusaltColKey, colKey, false);
            }
            String realmGet$payudebug = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$payudebug();
            if (realmGet$payudebug != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.payudebugColKey, colKey, realmGet$payudebug, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.payudebugColKey, colKey, false);
            }
            String realmGet$active = ((com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) object).realmGet$active();
            if (realmGet$active != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.activeColKey, colKey, realmGet$active, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.activeColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.PayuModel createDetachedCopy(com.ourdevelops.ourjek.models.PayuModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.PayuModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.PayuModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.PayuModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.PayuModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$payukey(realmSource.realmGet$payukey());
        unmanagedCopy.realmSet$payuid(realmSource.realmGet$payuid());
        unmanagedCopy.realmSet$payusalt(realmSource.realmGet$payusalt());
        unmanagedCopy.realmSet$payudebug(realmSource.realmGet$payudebug());
        unmanagedCopy.realmSet$active(realmSource.realmGet$active());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.PayuModel update(Realm realm, PayuModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.PayuModel realmObject, com.ourdevelops.ourjek.models.PayuModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_PayuModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PayuModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.payukeyColKey, realmObjectSource.realmGet$payukey());
        builder.addString(columnInfo.payuidColKey, realmObjectSource.realmGet$payuid());
        builder.addString(columnInfo.payusaltColKey, realmObjectSource.realmGet$payusalt());
        builder.addString(columnInfo.payudebugColKey, realmObjectSource.realmGet$payudebug());
        builder.addString(columnInfo.activeColKey, realmObjectSource.realmGet$active());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PayuModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{payukey:");
        stringBuilder.append(realmGet$payukey() != null ? realmGet$payukey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{payuid:");
        stringBuilder.append(realmGet$payuid() != null ? realmGet$payuid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{payusalt:");
        stringBuilder.append(realmGet$payusalt() != null ? realmGet$payusalt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{payudebug:");
        stringBuilder.append(realmGet$payudebug() != null ? realmGet$payudebug() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{active:");
        stringBuilder.append(realmGet$active() != null ? realmGet$active() : "null");
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
        com_ourdevelops_ourjek_models_PayuModelRealmProxy aPayuModel = (com_ourdevelops_ourjek_models_PayuModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aPayuModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPayuModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aPayuModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
