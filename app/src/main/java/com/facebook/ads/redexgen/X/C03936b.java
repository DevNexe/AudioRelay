package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03936b implements SensorEventListener {
    public static byte[] A09;
    public static String[] A0A = {"LMEfueB4gayQvpRN8xXm9AklEevQLqxV", "qKD5N87REqvFR6TOuYJE2bL", "", "yxtXe6d26bGgo70LmfUKAtnwRWe4i0hP", "QGB0NXt3pt8pLttf5OCs6Mo1nTnYeT90", "cpHchmbIsy8OjJq5SMyv1Bjwv0Y4tWtv", "hkg18epqSSQRsZzRGzTmSQr5c5v3YJAV", "CsdF03UMAkfQBN54GO6xo56"};
    public C6Z A00;
    public final Context A01;
    public final SensorManager A02;
    public final C6W A04;
    public final C6Y A05;
    public final EnumC04176z A06;
    public final List<Sensor> A07;
    public final Map<Integer, EnumC03976f> A08 = new HashMap();
    public final Handler A03 = new Handler(C7G.A00().A03().getLooper());

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0A[3].charAt(12) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "dphTU4VZCJVUxlSWVafH1ZM";
            strArr[1] = "vTUzDZVZybplSM6lZClu7qj";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
            i4++;
        }
    }

    public static void A01() {
        A09 = new byte[]{-3, -17, -8, -3, -7, -4};
    }

    static {
        A01();
    }

    public C03936b(Context context, C6W c6w, EnumC04176z enumC04176z) {
        this.A01 = context;
        this.A02 = (SensorManager) context.getSystemService(A00(0, 6, 54));
        this.A07 = this.A02.getSensorList(-1);
        this.A04 = c6w;
        this.A05 = new C6Y(this.A04, enumC04176z);
        this.A06 = enumC04176z;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.6Z] */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A02(List<EnumC03976f> list) {
        int iA02;
        try {
            for (EnumC03976f enumC03976f : list) {
                if (enumC03976f != null && (iA02 = enumC03976f.A02()) != -1 && this.A08.get(Integer.valueOf(enumC03976f.ordinal())) == null) {
                    if (iA02 == 0) {
                        if (C03926a.A00[enumC03976f.ordinal()] == 1) {
                            this.A05.A02(this.A01);
                        }
                    } else {
                        for (Sensor sensor : this.A07) {
                            if (iA02 == sensor.getType()) {
                                this.A00 = new SensorEventListener(this) { // from class: com.facebook.ads.redexgen.X.6Z
                                    public final SensorEventListener A00;

                                    {
                                        this.A00 = this;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onAccuracyChanged(Sensor sensor2, int i) {
                                        try {
                                            this.A00.onAccuracyChanged(sensor2, i);
                                        } catch (Throwable th) {
                                            C6O.A03(th);
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        try {
                                            this.A00.onSensorChanged(sensorEvent);
                                        } catch (Throwable th) {
                                            C6O.A03(th);
                                        }
                                    }
                                };
                                this.A02.registerListener(this.A00, sensor, 3, this.A03);
                                this.A08.put(Integer.valueOf(enumC03976f.ordinal()), enumC03976f);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A03(List<EnumC03976f> list) {
        try {
            if (this.A08 == null) {
                return;
            }
            if (list == null) {
                this.A02.unregisterListener(this.A00);
                this.A05.A01();
                this.A08.clear();
                return;
            }
            for (EnumC03976f enumC03976f : list) {
                if (enumC03976f.A02() != -1) {
                    if (enumC03976f.A02() == 0) {
                        this.A08.remove(Integer.valueOf(enumC03976f.ordinal()));
                        if (C03926a.A00[enumC03976f.ordinal()] == 1) {
                            this.A05.A01();
                        }
                    }
                    for (Sensor sensor : this.A07) {
                        if (enumC03976f.A02() == sensor.getType()) {
                            try {
                                this.A02.unregisterListener(this.A00, sensor);
                                this.A08.remove(Integer.valueOf(enumC03976f.ordinal()));
                                break;
                            } catch (Throwable t) {
                                C6O.A03(t);
                            }
                        }
                    }
                }
            }
        } catch (Throwable t2) {
            C6O.A03(t2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"CatchGeneralException"})
    public final void onSensorChanged(SensorEvent sensorEvent) {
        AnonymousClass78 anonymousClass78;
        if (sensorEvent == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String strA00 = this.A01 == null ? A00(0, 0, 32) : this.A01.getPackageName();
            if (this.A06 == EnumC04176z.A0G) {
                anonymousClass78 = null;
            } else {
                anonymousClass78 = new AnonymousClass78(strA00);
            }
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                this.A04.A02(new Y6(jElapsedRealtime, anonymousClass78, new C03966e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6V.A03);
                return;
            }
            if (type == 2) {
                this.A04.A02(new Y6(jElapsedRealtime, anonymousClass78, new C03966e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6V.A09);
                return;
            }
            if (type == 4) {
                this.A04.A02(new Y6(jElapsedRealtime, anonymousClass78, new C03966e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6V.A07);
                return;
            }
            if (type == 5) {
                this.A04.A02(new YC(jElapsedRealtime, anonymousClass78, sensorEvent.values[0]), C6V.A08);
                return;
            }
            if (type == 6) {
                this.A04.A02(new YC(jElapsedRealtime, anonymousClass78, sensorEvent.values[0]), C6V.A05);
                return;
            }
            if (type == 8) {
                this.A04.A02(new YC(jElapsedRealtime, anonymousClass78, sensorEvent.values[0]), C6V.A0B);
                return;
            }
            if (A0A[2].length() == 30) {
                throw new RuntimeException();
            }
            A0A[4] = "bqFyXbextQqAPSTh6NWFJn67Kuv1bHHX";
            if (type == 18) {
                this.A04.A02(new YC(jElapsedRealtime, anonymousClass78, sensorEvent.values[0]), C6V.A0D);
                return;
            }
            if (type == 20) {
                this.A04.A02(new Y6(jElapsedRealtime, anonymousClass78, new C03966e(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.values[3]})), C6V.A06);
            } else if (type == 12) {
                this.A04.A02(new YC(jElapsedRealtime, anonymousClass78, sensorEvent.values[0]), C6V.A0C);
            } else {
                if (type != 13) {
                    return;
                }
                this.A04.A02(new YC(jElapsedRealtime, anonymousClass78, sensorEvent.values[0]), C6V.A04);
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }
}
