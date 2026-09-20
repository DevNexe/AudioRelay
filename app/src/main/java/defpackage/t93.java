package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t93 {
    public final boolean a;
    public final String b;

    public t93(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final void a(fv1 fv1Var, rv1 rv1Var) {
        pa4 pa4VarA = rv1Var.a();
        xa4 xa4VarE = pa4VarA.e();
        if ((xa4VarE instanceof q93) || ur1.a(xa4VarE, xa4.QnHx.a)) {
            throw new IllegalArgumentException("Serializer for " + fv1Var.a() + " can't be registered as a subclass for polymorphic serialization because its kind " + xa4VarE + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        boolean z = this.a;
        if (!z && (ur1.a(xa4VarE, uv4.CQf.a) || ur1.a(xa4VarE, uv4.F1.a) || (xa4VarE instanceof ee3) || (xa4VarE instanceof xa4.CQf))) {
            throw new IllegalArgumentException("Serializer for " + fv1Var.a() + " of kind " + xa4VarE + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z) {
            return;
        }
        int iF = pa4VarA.f();
        for (int i = 0; i < iF; i++) {
            String strG = pa4VarA.g(i);
            if (ur1.a(strG, this.b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + fv1Var + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }
}
