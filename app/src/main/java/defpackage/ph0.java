package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph0 implements qy4.QnHx, y14.QnHx {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ph0(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public /* synthetic */ ph0(y14 y14Var, eu0 eu0Var, ua5 ua5Var) {
        this.w = 3;
        this.x = y14Var;
        this.z = eu0Var;
        this.y = ua5Var;
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        long jInsert;
        l52.QnHx qnHx = l52.QnHx.CACHE_FULL;
        int i = this.w;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 1:
                y14 y14Var = (y14) obj4;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                os0 os0Var = y14.B;
                y14Var.getClass();
                sQLiteDatabase.compileStatement((String) obj3).execute();
                y14.m(sQLiteDatabase.rawQuery((String) obj2, null), new w14(y14Var, 1));
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 2:
                y14 y14Var2 = (y14) obj4;
                Map map = (Map) obj3;
                is.QnHx qnHx2 = (is.QnHx) obj2;
                Cursor cursor = (Cursor) obj;
                os0 os0Var2 = y14.B;
                y14Var2.getClass();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    int i2 = cursor.getInt(1);
                    l52.QnHx qnHx3 = l52.QnHx.REASON_UNKNOWN;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            qnHx3 = l52.QnHx.MESSAGE_TOO_OLD;
                        } else if (i2 == 2) {
                            qnHx3 = qnHx;
                        } else if (i2 == 3) {
                            qnHx3 = l52.QnHx.PAYLOAD_TOO_BIG;
                        } else if (i2 == 4) {
                            qnHx3 = l52.QnHx.MAX_RETRIES_REACHED;
                        } else if (i2 == 5) {
                            qnHx3 = l52.QnHx.INVALID_PAYLOD;
                        } else if (i2 == 6) {
                            qnHx3 = l52.QnHx.SERVER_ERROR;
                        } else {
                            y52.a(Integer.valueOf(i2), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j = cursor.getLong(2);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    ((List) map.get(string)).add(new l52(j, qnHx3));
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i3 = q52.c;
                    new ArrayList();
                    qnHx2.b.add(new q52((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                final long jA = y14Var2.x.a();
                SQLiteDatabase sQLiteDatabaseG = y14Var2.g();
                sQLiteDatabaseG.beginTransaction();
                try {
                    w75 w75Var = (w75) y14.m(sQLiteDatabaseG.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new y14.QnHx() { // from class: x14
                        @Override // y14.QnHx
                        public final Object apply(Object obj5) {
                            Cursor cursor2 = (Cursor) obj5;
                            cursor2.moveToNext();
                            return new w75(cursor2.getLong(0), jA);
                        }
                    });
                    sQLiteDatabaseG.setTransactionSuccessful();
                    sQLiteDatabaseG.endTransaction();
                    qnHx2.a = w75Var;
                    qnHx2.c = new fa1(new bu4(y14Var2.g().compileStatement("PRAGMA page_size").simpleQueryForLong() * y14Var2.g().compileStatement("PRAGMA page_count").simpleQueryForLong(), nu0.a.b));
                    qnHx2.d = y14Var2.A.get();
                    return new is(qnHx2.a, Collections.unmodifiableList(qnHx2.b), qnHx2.c, qnHx2.d);
                } catch (Throwable th) {
                    sQLiteDatabaseG.endTransaction();
                    throw th;
                }
            default:
                y14 y14Var3 = (y14) obj4;
                eu0 eu0Var = (eu0) obj2;
                ua5 ua5Var = (ua5) obj3;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                os0 os0Var3 = y14.B;
                long jSimpleQueryForLong = y14Var3.g().compileStatement("PRAGMA page_size").simpleQueryForLong() * y14Var3.g().compileStatement("PRAGMA page_count").simpleQueryForLong();
                nu0 nu0Var = y14Var3.z;
                if (jSimpleQueryForLong >= nu0Var.e()) {
                    y14Var3.f(1L, qnHx, eu0Var.g());
                    return -1L;
                }
                Long lH = y14.h(sQLiteDatabase2, ua5Var);
                if (lH != null) {
                    jInsert = lH.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ua5Var.b());
                    contentValues.put("priority", Integer.valueOf(ke3.a(ua5Var.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (ua5Var.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(ua5Var.c(), 0));
                    }
                    jInsert = sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                int iD = nu0Var.d();
                byte[] bArr = eu0Var.d().b;
                boolean z = bArr.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", eu0Var.g());
                contentValues2.put("timestamp_ms", Long.valueOf(eu0Var.e()));
                contentValues2.put("uptime_ms", Long.valueOf(eu0Var.h()));
                contentValues2.put("payload_encoding", eu0Var.d().a.a);
                contentValues2.put("code", eu0Var.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long jInsert2 = sQLiteDatabase2.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) iD));
                    for (int i4 = 1; i4 <= iCeil; i4++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i4 - 1) * iD, Math.min(i4 * iD, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i4));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase2.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry2 : Collections.unmodifiableMap(eu0Var.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(MediationMetaData.KEY_NAME, (String) entry2.getKey());
                    contentValues4.put("value", (String) entry2.getValue());
                    sQLiteDatabase2.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
        }
    }

    @Override // qy4.QnHx
    public final Object e() {
        rh0 rh0Var = (rh0) this.x;
        ua5 ua5Var = (ua5) this.y;
        rh0Var.d.f0(ua5Var, (eu0) this.z);
        rh0Var.a.a(ua5Var, 1);
        return null;
    }
}
