package defpackage;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public final class vm4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ rt<Float> A;
    public final /* synthetic */ rt<Float> w;
    public final /* synthetic */ j81<Float, Float> x;
    public final /* synthetic */ float y;
    public final /* synthetic */ ri2<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vm4(rt<Float> rtVar, j81<? super Float, Float> j81Var, float f, ri2<Float> ri2Var, rt<Float> rtVar2) {
        super(0);
        this.w = rtVar;
        this.x = j81Var;
        this.y = f;
        this.z = ri2Var;
        this.A = rtVar2;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        rt<Float> rtVar = this.w;
        float fFloatValue = (rtVar.e().floatValue() - rtVar.b().floatValue()) / AdError.NETWORK_ERROR_CODE;
        float fFloatValue2 = this.x.invoke(Float.valueOf(this.y)).floatValue();
        ri2<Float> ri2Var = this.z;
        if (Math.abs(fFloatValue2 - ri2Var.getValue().floatValue()) > fFloatValue) {
            if (this.A.c(ri2Var.getValue())) {
                ri2Var.setValue(Float.valueOf(fFloatValue2));
            }
        }
        return sd5.a;
    }
}
