package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzear implements SensorEventListener {
    public final Context a;

    @Nullable
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public zzeaq f;

    @GuardedBy("this")
    public boolean g;

    public zzear(Context context) {
        this.a = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhD)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) < ((Float) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhE)).floatValue()) {
                return;
            }
            long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
            if (this.d + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhF)).intValue()) > jB) {
                return;
            }
            if (this.d + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhG)).intValue()) < jB) {
                this.e = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
            this.d = jB;
            int i = this.e + 1;
            this.e = i;
            zzeaq zzeaqVar = this.f;
            if (zzeaqVar != null) {
                if (i == ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhH)).intValue()) {
                    ((zzeai) zzeaqVar).zzg(new zzeaf(), zzeah.GESTURE);
                }
            }
        }
    }

    public final void zza() {
        synchronized (this) {
            if (this.g) {
                SensorManager sensorManager = this.b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.c);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.g = false;
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhD)).booleanValue()) {
                if (this.b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                    this.b = sensorManager2;
                    if (sensorManager2 == null) {
                        zzcgn.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.d = com.google.android.gms.ads.internal.zzt.zzB().b() - ((long) ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhF)).intValue());
                    this.g = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc(zzeaq zzeaqVar) {
        this.f = zzeaqVar;
    }
}
