package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 dh3, still in use, count: 1, list:
  (r1v1 dh3) from 0x004b: INVOKE (r11v3 android.util.SparseArray), (1 int), (r1v1 dh3) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:76)
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
/* JADX INFO: loaded from: classes.dex */
public final class dh3 {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY,
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER,
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED;

    static {
        dh3 dh3Var = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, dh3Var);
        sparseArray.put(1, dh3Var);
        sparseArray.put(2, dh3Var);
        sparseArray.put(3, dh3Var);
        sparseArray.put(4, dh3Var);
        sparseArray.put(-1, dh3Var);
    }

    public dh3() {
        super(str, i);
    }

    public static dh3 valueOf(String str) {
        return (dh3) Enum.valueOf(dh3.class, str);
    }

    public static dh3[] values() {
        return (dh3[]) x.clone();
    }
}
