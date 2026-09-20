package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ia4 extends cx1 implements j81<Integer, Object> {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia4(int i) {
        super(1);
        this.w = i;
    }

    @Override // defpackage.j81
    public final Object invoke(Integer num) {
        num.intValue();
        throw new IndexOutOfBoundsException(qc0.a(new StringBuilder("Sequence doesn't contain element at index "), this.w, '.'));
    }
}
