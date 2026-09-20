package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzfph;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class e96 implements SensorEventListener {
    public final SensorManager a;
    public final Display c;

    @GuardedBy("sensorThreadLock")
    public float[] f;
    public zzfph g;
    public d96 h;
    public final float[] d = new float[9];
    public final float[] e = new float[9];
    public final Object b = new Object();

    public e96(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a() {
        if (this.g == null) {
            return;
        }
        this.a.unregisterListener(this);
        this.g.post(new uy5(1));
        this.g = null;
    }

    public final boolean b(float[] fArr) {
        synchronized (this.b) {
            float[] fArr2 = this.f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.b) {
            if (this.f == null) {
                this.f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.d, fArr);
        int rotation = this.c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
        } else if (rotation != 3) {
            System.arraycopy(this.d, 0, this.e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
        }
        float[] fArr2 = this.e;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f2 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f2;
        float f3 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f3;
        synchronized (this.b) {
            System.arraycopy(this.e, 0, this.f, 0, 9);
        }
        d96 d96Var = this.h;
        if (d96Var != null) {
            d96Var.zza();
        }
    }
}
