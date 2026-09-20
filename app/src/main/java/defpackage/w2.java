package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends cx1 implements h81<Iterator<Object>> {
    public final /* synthetic */ Object[] w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(Object[] objArr) {
        super(0);
        this.w = objArr;
    }

    @Override // defpackage.h81
    public final Iterator<Object> invoke() {
        return new tj1(this.w);
    }
}
