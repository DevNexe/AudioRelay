package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.zg6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefz extends SQLiteOpenHelper {
    public static final /* synthetic */ int y = 0;
    public final Context w;
    public final zzfyy x;

    public zzefz(Context context, zzfyy zzfyyVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhe)).intValue());
        this.w = context;
        this.x = zzfyyVar;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, zzcgs zzcgsVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = cursorQuery.getString(columnIndex);
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                zzcgsVar.zza(strArr[i2]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void b(zzfgs zzfgsVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzfyy zzfyyVar = this.x;
        zzfyo.zzr(zzfyyVar.zzb(callable), new zg6(zzfgsVar), zzfyyVar);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(final String str) {
        b(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                String str2 = str;
                int i = zzefz.y;
                ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str2, Integer.toString(0)});
                return null;
            }
        });
    }

    public final void zzd(final zzegb zzegbVar) {
        b(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                zzefz zzefzVar = this.zza;
                zzegb zzegbVar2 = zzegbVar;
                zzefzVar.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(zzegbVar2.zza));
                contentValues.put("gws_query_id", zzegbVar2.zzb);
                contentValues.put("url", zzegbVar2.zzc);
                contentValues.put("event_state", Integer.valueOf(zzegbVar2.zzd - 1));
                ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
                com.google.android.gms.ads.internal.zzt.zzq();
                Context context = zzefzVar.w;
                zzbr zzbrVarZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
                if (zzbrVarZzw != null) {
                    try {
                        zzbrVarZzw.zze(new ObjectWrapper(context));
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
                    }
                }
                return null;
            }
        });
    }

    public final void zzh(final zzcgs zzcgsVar, final String str) {
        b(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                zzefz zzefzVar = this.zza;
                zzcgs zzcgsVar2 = zzcgsVar;
                String str2 = str;
                zzefzVar.getClass();
                zzefzVar.x.execute(new zzeft((SQLiteDatabase) obj, str2, zzcgsVar2));
                return null;
            }
        });
    }
}
