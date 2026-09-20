package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import defpackage.r66;
import defpackage.s66;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxs extends zzbya {
    public final Map c;
    public final Activity d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    public zzbxs(zzcmn zzcmnVar, Map map) {
        long j;
        super(zzcmnVar, "createCalendarEvent");
        this.c = map;
        this.d = zzcmnVar.zzk();
        this.e = a("description");
        this.h = a("summary");
        String str = (String) map.get("start_ticks");
        long j2 = -1;
        if (str == null) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j = -1;
            }
        }
        this.f = j;
        String str2 = (String) this.c.get("end_ticks");
        if (str2 != null) {
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.g = j2;
        this.i = a("location");
    }

    public final String a(String str) {
        Map map = this.c;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    public final void zzc() {
        Activity activity = this.d;
        if (activity == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        if (!new zzbii(activity).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzp().zzd();
        builderZzG.setTitle(resourcesZzd != null ? resourcesZzd.getString(R.string.s5) : "Create calendar event");
        builderZzG.setMessage(resourcesZzd != null ? resourcesZzd.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderZzG.setPositiveButton(resourcesZzd != null ? resourcesZzd.getString(R.string.s3) : "Accept", new r66(this));
        builderZzG.setNegativeButton(resourcesZzd != null ? resourcesZzd.getString(R.string.s4) : "Decline", new s66(this));
        builderZzG.create().show();
    }
}
