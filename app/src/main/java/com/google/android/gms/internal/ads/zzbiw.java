package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import defpackage.q46;
import defpackage.ra1;
import defpackage.so5;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbiw implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) zzbja.zza(new zzbiu(this)));
        } catch (JSONException unused) {
        }
    }

    public final Object zzb(final zzbiq zzbiqVar) {
        if (!this.b.block(5000L)) {
            synchronized (this.a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.c || this.e == null) {
            synchronized (this.a) {
                if (this.c && this.e != null) {
                }
                return zzbiqVar.zzm();
            }
        }
        if (zzbiqVar.zze() != 2) {
            return (zzbiqVar.zze() == 1 && this.h.has(zzbiqVar.zzn())) ? zzbiqVar.a(this.h) : zzbja.zza(new zzfsv() { // from class: com.google.android.gms.internal.ads.zzbit
                @Override // com.google.android.gms.internal.ads.zzfsv
                public final Object zza() {
                    return zzbiqVar.b(this.zza.e);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? zzbiqVar.zzm() : zzbiqVar.zzb(bundle);
    }

    public final void zze(Context context) {
        Context applicationContext;
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            if (!this.d) {
                this.d = true;
            }
            Context applicationContext2 = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.g = applicationContext2;
            try {
                this.f = so5.a(applicationContext2).a(128, this.g.getPackageName()).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                AtomicBoolean atomicBoolean = ra1.a;
                try {
                    applicationContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused2) {
                    applicationContext = null;
                }
                if (applicationContext != null || (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                com.google.android.gms.ads.internal.client.zzay.zzb();
                SharedPreferences sharedPreferencesZza = zzbis.zza(context);
                this.e = sharedPreferencesZza;
                if (sharedPreferencesZza != null) {
                    sharedPreferencesZza.registerOnSharedPreferenceChangeListener(this);
                }
                zzblf.zzc(new q46(this));
                if (this.e != null) {
                    try {
                        this.h = new JSONObject((String) zzbja.zza(new zzbiu(this)));
                    } catch (JSONException unused3) {
                    }
                }
                this.c = true;
                this.d = false;
                this.b.open();
            } catch (Throwable th) {
                this.d = false;
                this.b.open();
                throw th;
            }
        }
    }
}
