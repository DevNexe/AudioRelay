package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qc1 {
    public final yh a;
    public long b = 262144;

    public qc1(yh yhVar) {
        this.a = yhVar;
    }

    public final nc1 a() {
        nc1.QnHx qnHx = new nc1.QnHx();
        while (true) {
            String strQ = this.a.Q(this.b);
            this.b -= (long) strQ.length();
            if (strQ.length() == 0) {
                return qnHx.b();
            }
            int iE = mv4.E(strQ, ':', 1, false, 4);
            if (iE != -1) {
                qnHx.a(strQ.substring(0, iE), strQ.substring(iE + 1));
            } else if (strQ.charAt(0) == ':') {
                qnHx.a("", strQ.substring(1));
            } else {
                qnHx.a("", strQ);
            }
        }
    }
}
