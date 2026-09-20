package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzu implements SensorEventListener {

    @Nullable
    public final SensorManager a;

    @Nullable
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e = com.google.android.gms.ads.internal.zzt.zzB().b();
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    @Nullable
    public zzdzt i = null;

    @GuardedBy("this")
    public boolean j = false;

    public zzdzu(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhI)).booleanValue()) {
            long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
            if (this.e + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhK)).intValue()) < jB) {
                this.f = 0;
                this.e = jB;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            Float fValueOf = Float.valueOf((sensorEvent.values[1] * 4.0f) + this.d.floatValue());
            this.d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f = this.c;
            zzbiq zzbiqVar = zzbiy.zzhJ;
            if (fFloatValue > ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).floatValue() + f) {
                this.c = this.d.floatValue();
                this.h = true;
            } else if (this.d.floatValue() < this.c - ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.e = jB;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                zzdzt zzdztVar = this.i;
                if (zzdztVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhL)).intValue()) {
                        ((zzeai) zzdztVar).zzg(new zzeag(), zzeah.GESTURE);
                    }
                }
            }
        }
    }

    public final void zza() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.j = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhI)).booleanValue()) {
                if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.j = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.a == null || this.b == null) {
                    zzcgn.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzc(zzdzt zzdztVar) {
        this.i = zzdztVar;
    }
}
