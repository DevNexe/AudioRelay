package defpackage;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class gn2 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gn2$CQf, still in use, count: 1, list:
  (r0v0 gn2$CQf) from 0x0108: INVOKE (r4v8 android.util.SparseArray<gn2$CQf>), (0 int), (r0v0 gn2$CQf) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:265)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class CQf {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH(7),
        /* JADX INFO: Fake field, exist only in values array */
        DUMMY(8),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET(9),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_FOTA(10),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IMS(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_CBS(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        NONE(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        /* JADX INFO: Fake field, exist only in values array */
        NONE(-1);

        public static final SparseArray<CQf> w;

        static {
            SparseArray<CQf> sparseArray = new SparseArray<>();
            w = sparseArray;
            sparseArray.put(0, cQf);
            sparseArray.put(1, cQf);
            sparseArray.put(2, cQf);
            sparseArray.put(3, cQf);
            sparseArray.put(4, cQf);
            sparseArray.put(5, cQf);
            sparseArray.put(6, cQf);
            sparseArray.put(7, cQf);
            sparseArray.put(8, cQf);
            sparseArray.put(9, cQf);
            sparseArray.put(10, cQf);
            sparseArray.put(11, cQf);
            sparseArray.put(12, cQf);
            sparseArray.put(13, cQf);
            sparseArray.put(14, cQf);
            sparseArray.put(15, cQf);
            sparseArray.put(16, cQf);
            sparseArray.put(17, cQf);
            sparseArray.put(-1, cQf);
        }

        public CQf(int i) {
            super(str, i);
        }

        public static CQf valueOf(String str) {
            return (CQf) Enum.valueOf(CQf.class, str);
        }

        public static CQf[] values() {
            return (CQf[]) x.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gn2$QnHx, still in use, count: 1, list:
  (r0v0 gn2$QnHx) from 0x011f: INVOKE (r2v11 android.util.SparseArray<gn2$QnHx>), (0 int), (r0v0 gn2$QnHx) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:288)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class QnHx {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        RTT(7),
        /* JADX INFO: Fake field, exist only in values array */
        HSDPA(8),
        /* JADX INFO: Fake field, exist only in values array */
        HSUPA(9),
        /* JADX INFO: Fake field, exist only in values array */
        HSPA(10),
        /* JADX INFO: Fake field, exist only in values array */
        IDEN(11),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_B(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(100);

        public static final SparseArray<QnHx> w;

        static {
            SparseArray<QnHx> sparseArray = new SparseArray<>();
            w = sparseArray;
            sparseArray.put(0, qnHx);
            sparseArray.put(1, qnHx);
            sparseArray.put(2, qnHx);
            sparseArray.put(3, qnHx);
            sparseArray.put(4, qnHx);
            sparseArray.put(5, qnHx);
            sparseArray.put(6, qnHx);
            sparseArray.put(7, qnHx);
            sparseArray.put(8, qnHx);
            sparseArray.put(9, qnHx);
            sparseArray.put(10, qnHx);
            sparseArray.put(11, qnHx);
            sparseArray.put(12, qnHx);
            sparseArray.put(13, qnHx);
            sparseArray.put(14, qnHx);
            sparseArray.put(15, qnHx);
            sparseArray.put(16, qnHx);
            sparseArray.put(17, qnHx);
            sparseArray.put(18, qnHx);
            sparseArray.put(19, qnHx);
        }

        public QnHx(int i) {
            super(str, i);
        }

        public static QnHx valueOf(String str) {
            return (QnHx) Enum.valueOf(QnHx.class, str);
        }

        public static QnHx[] values() {
            return (QnHx[]) x.clone();
        }
    }

    public abstract QnHx a();

    public abstract CQf b();
}
