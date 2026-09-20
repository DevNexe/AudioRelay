package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzeft implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcgs zzc;

    public /* synthetic */ zzeft(SQLiteDatabase sQLiteDatabase, String str, zzcgs zzcgsVar) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = zzcgsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase = this.zza;
        String str = this.zzb;
        zzcgs zzcgsVar = this.zzc;
        int i = zzefz.y;
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzefz.c(sQLiteDatabase, zzcgsVar);
    }
}
