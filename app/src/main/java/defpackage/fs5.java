package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class fs5 extends g27 {
    public String d;
    public HashSet e;
    public Bt7j f;
    public Long g;
    public Long h;

    public fs5(r27 r27Var) {
        super(r27Var);
    }

    @Override // defpackage.g27
    public final void h() {
    }

    public final rb7 i(Integer num) {
        if (this.f.containsKey(num)) {
            return (rb7) this.f.getOrDefault(num, null);
        }
        rb7 rb7Var = new rb7(this, this.d);
        this.f.put(num, rb7Var);
        return rb7Var;
    }
}
