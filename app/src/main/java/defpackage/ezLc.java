package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import com.azefsw.audioconnect.R;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ezLc implements ID {
    public final pg a;
    public final fm3 b;
    public final lKy3 c;

    public static final class CQf<T1, T2, T3, T4, T5, R> implements d91<T1, T2, T3, T4, T5, R> {
        public final /* synthetic */ y63 x;
        public final /* synthetic */ e51 y;
        public final /* synthetic */ Sb1 z;

        public CQf(y63 y63Var, e51 e51Var, Sb1 sb1) {
            this.x = y63Var;
            this.y = e51Var;
            this.z = sb1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.d91
        public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) throws Exception {
            ad0 ad0VarA;
            ad0 ad0Var;
            List<pg.QnHx> list;
            int i;
            Object next;
            boolean zBooleanValue = ((Boolean) t5).booleanValue();
            boolean zBooleanValue2 = ((Boolean) t4).booleanValue();
            int iIntValue = ((Number) t3).intValue();
            A$Y4 a$y4 = (A$Y4) t2;
            og ogVar = (og) t1;
            q1 q1Var = new q1(zBooleanValue2, zBooleanValue);
            for (kv2 kv2Var : kv2.values()) {
                if (iIntValue == kv2Var.w) {
                    ezLc ezlc = ezLc.this;
                    ezlc.getClass();
                    Sb1 sb1 = this.z;
                    int i2 = sb1.a;
                    int iN = XTd3.n(sb1);
                    XTd3.j(sb1);
                    int minBufferSize = AudioTrack.getMinBufferSize(i2, iN, 2);
                    if (minBufferSize < 0) {
                        a62.a.i(minBufferSize, "use_default_buffer_size");
                        minBufferSize = 8192;
                    }
                    int iH = (int) OW8.h(sb1, minBufferSize);
                    a62.a.j("audio_track_buffer_ms", String.valueOf(iH));
                    l1 l1Var = new l1(iH, minBufferSize);
                    int i3 = this.x.c;
                    e51 e51Var = this.y;
                    if (e51Var != null) {
                        ig igVar = e51Var.a;
                        ad0Var = new ad0(igVar.a, igVar.b);
                    } else {
                        lKy3 lky3 = ezlc.c;
                        mg mgVarL = lky3.l();
                        if (QnHx.a[mgVarL.ordinal()] == 1) {
                            ad0VarA = lky3.m();
                        } else {
                            int iOrdinal = mgVarL.ordinal();
                            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalArgumentException("can't be called to retrieve a custom buffer size.");
                            }
                            ad0VarA = ogVar.a(mgVarL);
                        }
                        if (a$y4 == A$Y4.AudioTrack) {
                            pg pgVar = ezlc.a;
                            pgVar.getClass();
                            int iOrdinal2 = mgVarL.ordinal();
                            if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                                list = pgVar.c;
                            } else {
                                if (iOrdinal2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                list = pgVar.d;
                            }
                            Iterator<T> it = list.iterator();
                            do {
                                boolean zHasNext = it.hasNext();
                                i = ad0VarA.b;
                                if (!zHasNext) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!(iH >= i - ((pg.QnHx) next).a));
                            pg.QnHx qnHx = (pg.QnHx) next;
                            int i4 = ad0VarA.a;
                            if (qnHx != null) {
                                int i5 = qnHx.b + iH;
                                a62.a.i(i5, "max_buffer_size_overridden");
                                Context context = pgVar.a;
                                pgVar.b.a(new mp2("OVERRIDE_MAXIMUM_BUFFER", context.getString(R.string.running_notice_max_buffer_change_title), context.getString(R.string.running_notice_max_buffer_change_description, Integer.valueOf(i), Integer.valueOf(i5)), "", 16));
                                ad0VarA = new ad0(i4, i5);
                            }
                            int iMax = Math.max(iH, i4);
                            int i6 = ad0VarA.b;
                            ad0 ad0Var2 = new ad0(iMax, i6);
                            if (i4 != iMax) {
                                a62.a.c("Changed the minimum buffer size from " + i4 + " to " + iMax);
                            }
                            if (i != i6) {
                                a62.a.c("Changed the maximum buffer size from " + i + " to " + i6);
                            }
                            ad0VarA = ad0Var2;
                        }
                        ad0Var = ad0VarA;
                    }
                    return (R) new t6r8(a$y4, sb1, i3, ad0Var, q1Var, l1Var, kv2Var);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mg.values().length];
            iArr[3] = 1;
            a = iArr;
        }
    }

    public ezLc(pg pgVar, fm3 fm3Var, lKy3 lky3) {
        this.a = pgVar;
        this.b = fm3Var;
        this.c = lky3;
    }

    @Override // defpackage.ID
    public final vq2<VQko> a(y63 y63Var, e51 e51Var, Sb1 sb1) {
        vq2<og> vq2VarJ = this.b.n().j();
        ur2 ur2Var = new ur2(new r23(this, 1));
        lKy3 lky3 = this.c;
        lky3.getClass();
        return vq2.j(vq2VarJ, vq2.m(ur2Var, new rs2(lky3.j(lky3.d(R.string.pref_audio_output_type_key), null, new uUq(lky3)))), lky3.s.a(null), lky3.j(lky3.d(R.string.pref_audio_track_enable_low_latency_key), null, new dEgm(lky3)), lky3.j(lky3.d(R.string.pref_audio_track_enable_session_id_broadcast_key), null, new l$ZI(lky3)), new CQf(y63Var, e51Var, sb1));
    }
}
