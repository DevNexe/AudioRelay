package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class rv2<A> {
    public abstract boolean a();

    public String toString() {
        if (this instanceof gp2) {
            return "Option.None";
        }
        if (!(this instanceof mq4)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Option.Some(" + ((mq4) this).a + ')';
    }
}
