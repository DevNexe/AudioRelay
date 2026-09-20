package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class p84 {
    public static final CQf w;
    public static final /* synthetic */ p84[] x;

    public static final class CQf extends p84 {
        public CQf() {
            super(0, "Vertical");
        }

        public final int a(long j, dl3 dl3Var) {
            if (dl3Var.a(j)) {
                return 0;
            }
            if (kt2.d(j) < dl3Var.b) {
                return -1;
            }
            return (kt2.c(j) >= dl3Var.a || kt2.d(j) >= dl3Var.d) ? 1 : -1;
        }
    }

    static {
        CQf cQf = new CQf();
        w = cQf;
        x = new p84[]{cQf, new p84() { // from class: p84.QnHx
        }};
    }

    public p84() {
        throw null;
    }

    public p84(int i, String str) {
        super(str, i);
    }

    public static p84 valueOf(String str) {
        return (p84) Enum.valueOf(p84.class, str);
    }

    public static p84[] values() {
        return (p84[]) x.clone();
    }
}
