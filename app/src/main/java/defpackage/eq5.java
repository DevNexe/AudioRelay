package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class eq5<T> implements ku2<T> {
    public final long A;
    public final pa1 w;
    public final int x;
    public final Hp<?> y;
    public final long z;

    public eq5(pa1 pa1Var, int i, Hp hp, long j, long j2) {
        this.w = pa1Var;
        this.x = i;
        this.y = hp;
        this.z = j;
        this.A = j2;
    }

    public static d60 a(tp5<?> tp5Var, QnHx<?> qnHx, int i) {
        d60 telemetryConfiguration = qnHx.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.x) {
            return null;
        }
        boolean z = true;
        int[] iArr = telemetryConfiguration.z;
        if (iArr == null) {
            int[] iArr2 = telemetryConfiguration.B;
            if (iArr2 != null) {
                int length = iArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (iArr2[i2] == i) {
                        break;
                    }
                    i2++;
                }
                if (z) {
                    return null;
                }
            }
        } else {
            int length2 = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z = false;
                    break;
                }
                if (iArr[i3] == i) {
                    break;
                }
                i3++;
            }
            if (!z) {
                return null;
            }
        }
        if (tp5Var.H < telemetryConfiguration.A) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // defpackage.ku2
    public final void onComplete(w05<T> w05Var) {
        tp5 tp5Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int iElapsedRealtime;
        pa1 pa1Var = this.w;
        if (pa1Var.a()) {
            ht3 ht3Var = gt3.a().a;
            if ((ht3Var == null || ht3Var.x) && (tp5Var = (tp5) pa1Var.F.get(this.y)) != null) {
                Object obj = tp5Var.x;
                if (obj instanceof QnHx) {
                    QnHx qnHx = (QnHx) obj;
                    long j3 = this.z;
                    boolean z = j3 > 0;
                    int gCoreServiceId = qnHx.getGCoreServiceId();
                    if (ht3Var != null) {
                        z &= ht3Var.y;
                        if (!qnHx.hasConnectionInfo() || qnHx.isConnecting()) {
                            i3 = ht3Var.A;
                        } else {
                            d60 d60VarA = a(tp5Var, qnHx, this.x);
                            if (d60VarA == null) {
                                return;
                            }
                            boolean z2 = d60VarA.y && j3 > 0;
                            i3 = d60VarA.A;
                            z = z2;
                        }
                        i = ht3Var.z;
                        i2 = ht3Var.w;
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    if (w05Var.n()) {
                        i6 = 0;
                        i5 = 0;
                    } else {
                        if (w05Var.l()) {
                            i4 = 100;
                        } else {
                            Exception excJ = w05Var.j();
                            if (excJ instanceof ApiException) {
                                Status status = ((ApiException) excJ).w;
                                int i7 = status.x;
                                z50 z50Var = status.A;
                                i5 = z50Var == null ? -1 : z50Var.x;
                                i6 = i7;
                            } else {
                                i4 = 101;
                            }
                        }
                        i6 = i4;
                        i5 = -1;
                    }
                    if (z) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.A);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                        iElapsedRealtime = -1;
                    }
                    mr5 mr5Var = pa1Var.I;
                    mr5Var.sendMessage(mr5Var.obtainMessage(18, new fq5(new ge2(this.x, i6, i5, j, j2, null, null, gCoreServiceId, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}
