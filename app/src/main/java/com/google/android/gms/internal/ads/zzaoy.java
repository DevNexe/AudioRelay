package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import defpackage.g7;
import defpackage.vy5;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaoy implements zzaox {
    public static volatile zzaqb P;
    public double F;
    public double G;
    public double H;
    public float I;
    public float J;
    public float K;
    public float L;
    public final DisplayMetrics O;
    public MotionEvent w;
    public final LinkedList x = new LinkedList();
    public long y = 0;
    public long z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public long D = 0;
    public long E = 0;
    public boolean M = false;
    public boolean N = false;

    public zzaoy(Context context) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcu)).booleanValue()) {
                vy5.b();
            } else {
                g7.m(P);
            }
            this.O = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    public abstract zzamh b(Context context, View view, Activity activity);

    public abstract zzamh c(Context context);

    public abstract zzamh d(Context context, View view, Activity activity);

    public abstract zzaqd e(MotionEvent motionEvent);

    public final void f() {
        this.C = 0L;
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.D = 0L;
        this.E = 0L;
        LinkedList linkedList = this.x;
        if (linkedList.size() > 0) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        } else {
            MotionEvent motionEvent = this.w;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.w = null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[Catch: Exception -> 0x0106, TryCatch #3 {Exception -> 0x0106, blocks: (B:48:0x00c0, B:51:0x00cd, B:60:0x00f0, B:61:0x0100), top: B:82:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[Catch: Exception -> 0x0106, TRY_LEAVE, TryCatch #3 {Exception -> 0x0106, blocks: (B:48:0x00c0, B:51:0x00cd, B:60:0x00f0, B:61:0x0100), top: B:82:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String g(Context context, String str, int i, View view, Activity activity) {
        zzaow zzaowVarZzd;
        String str2;
        int i2;
        Exception exc;
        zzamh zzamhVarB;
        int i3;
        long jCurrentTimeMillis;
        String strA;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcb)).booleanValue();
        zzamh zzamhVarC = null;
        if (zBooleanValue) {
            zzaowVarZzd = P != null ? P.zzd() : null;
            str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcu)).booleanValue() ? "te" : "be";
        } else {
            zzaowVarZzd = null;
            str2 = null;
        }
        try {
            if (i7 == 3) {
                zzamhVarB = b(context, view, activity);
                try {
                    this.M = true;
                    zzamhVarC = zzamhVarB;
                    i6 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (zBooleanValue) {
                    }
                    zzamhVarC = zzamhVarB;
                }
            } else if (i7 == 2) {
                zzamhVarC = d(context, view, activity);
                i6 = 1008;
            } else {
                zzamhVarC = c(context);
                i6 = AdError.NETWORK_ERROR_CODE;
            }
            if (!zBooleanValue || zzaowVarZzd == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzaowVarZzd.zzc(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    zzamhVarB = zzamhVarC;
                    exc = e;
                    if (zBooleanValue || zzaowVarZzd == null) {
                        zzamhVarC = zzamhVarB;
                    } else {
                        if (i7 == i2) {
                            i3 = 1003;
                        } else if (i7 == 2) {
                            i3 = 1009;
                        } else {
                            i7 = 1;
                            i3 = AdError.NO_FILL_ERROR_CODE;
                        }
                        zzaowVarZzd.zzc(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzamhVarB == null) {
                        try {
                            if (((zzamx) zzamhVarB.zzal()).zzax() == 0) {
                                strA = Integer.toString(5);
                            } else {
                                strA = vy5.a((zzamx) zzamhVarB.zzal(), str);
                                if (zBooleanValue) {
                                    if (i7 == i2) {
                                        i4 = 1006;
                                    } else if (i7 == 2) {
                                        i4 = 1010;
                                    } else {
                                        i4 = 1004;
                                    }
                                    zzaowVarZzd.zzc(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e3) {
                            strA = Integer.toString(7);
                            if (zBooleanValue && zzaowVarZzd != null) {
                                if (i7 == i2) {
                                    i5 = 1007;
                                } else {
                                    i5 = i7 == 2 ? 1011 : 1005;
                                }
                                zzaowVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e3);
                            }
                        }
                    } else {
                        strA = Integer.toString(5);
                    }
                    return strA;
                }
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 3;
        }
        zzamhVarB = zzamhVarC;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzamhVarB == null) {
            strA = Integer.toString(5);
        } else if (((zzamx) zzamhVarB.zzal()).zzax() == 0) {
            strA = Integer.toString(5);
        } else {
            strA = vy5.a((zzamx) zzamhVarB.zzal(), str);
            if (zBooleanValue && zzaowVarZzd != null) {
                if (i7 == i2) {
                    i4 = 1006;
                } else if (i7 == 2) {
                    i4 = 1010;
                } else {
                    i4 = 1004;
                }
                zzaowVarZzd.zzc(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strA;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zze(Context context, String str, View view) {
        return g(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzf(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzg(Context context) {
        if (zzaqe.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return g(context, null, 1, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final String zzh(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.M) {
            f();
            this.M = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.F = 0.0d;
            this.G = motionEvent.getRawX();
            this.H = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.G;
            double d2 = rawY - this.H;
            this.F += Math.sqrt((d2 * d2) + (d * d));
            this.G = rawX;
            this.H = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.w = motionEventObtain;
                    this.x.add(motionEventObtain);
                    if (this.x.size() > 6) {
                        ((MotionEvent) this.x.remove()).recycle();
                    }
                    this.A++;
                    this.C = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.z += (long) (motionEvent.getHistorySize() + 1);
                    zzaqd zzaqdVarE = e(motionEvent);
                    Long l2 = zzaqdVarE.zzd;
                    if (l2 != null && zzaqdVarE.zzg != null) {
                        this.D = l2.longValue() + zzaqdVarE.zzg.longValue() + this.D;
                    }
                    if (this.O != null && (l = zzaqdVarE.zze) != null && zzaqdVarE.zzh != null) {
                        this.E = l.longValue() + zzaqdVarE.zzh.longValue() + this.E;
                    }
                } else if (action2 == 3) {
                    this.B++;
                }
            } catch (zzaps unused) {
            }
        } else {
            this.I = motionEvent.getX();
            this.J = motionEvent.getY();
            this.K = motionEvent.getRawX();
            this.L = motionEvent.getRawY();
            this.y++;
        }
        this.N = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.w != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbZ)).booleanValue()) {
                f();
            } else {
                this.w.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.O;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.w = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.w = null;
        }
        this.N = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaox
    public void zzn(View view) {
    }
}
