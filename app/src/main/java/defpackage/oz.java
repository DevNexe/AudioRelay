package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oz implements ys {
    public final ClipboardManager a;

    public oz(Context context) {
        Object systemService = context.getSystemService("clipboard");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        this.a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    @Override // defpackage.ys
    public final void a(Z7jl z7jl) {
        byte b;
        List<Z7jl.CQf<rq4>> list = z7jl.x;
        boolean zIsEmpty = list.isEmpty();
        CharSequence charSequence = z7jl.w;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            ta2 ta2Var = new ta2(1);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Z7jl.CQf<rq4> cQf = list.get(i);
                rq4 rq4Var = cQf.a;
                ((Parcel) ta2Var.x).recycle();
                ta2Var.x = Parcel.obtain();
                long jA = rq4Var.a();
                long j = yu.h;
                if (!yu.c(jA, j)) {
                    ta2Var.c((byte) 1);
                    ((Parcel) ta2Var.x).writeLong(rq4Var.a());
                }
                long j2 = z55.c;
                long j3 = rq4Var.b;
                byte b2 = 2;
                if (!z55.a(j3, j2)) {
                    ta2Var.c((byte) 2);
                    ta2Var.e(j3);
                }
                x41 x41Var = rq4Var.c;
                if (x41Var != null) {
                    ta2Var.c((byte) 3);
                    ((Parcel) ta2Var.x).writeInt(x41Var.w);
                }
                v41 v41Var = rq4Var.d;
                if (v41Var != null) {
                    ta2Var.c((byte) 4);
                    int i2 = v41Var.a;
                    if (i2 == 0) {
                        b = 0;
                    } else if (i2 == 1) {
                        b = 1;
                    } else {
                        b = 0;
                    }
                    ta2Var.c(b);
                }
                w41 w41Var = rq4Var.e;
                if (w41Var != null) {
                    ta2Var.c((byte) 5);
                    int i3 = w41Var.a;
                    if (i3 == 0) {
                        b2 = 0;
                    } else if (i3 == 1) {
                        b2 = 1;
                    } else if (!(i3 == 2)) {
                        if (i3 == 3) {
                            b2 = 3;
                        } else {
                            b2 = 0;
                        }
                    }
                    ta2Var.c(b2);
                }
                String str = rq4Var.g;
                if (str != null) {
                    ta2Var.c((byte) 6);
                    ((Parcel) ta2Var.x).writeString(str);
                }
                long j4 = rq4Var.h;
                if (!z55.a(j4, j2)) {
                    ta2Var.c((byte) 7);
                    ta2Var.e(j4);
                }
                x8 x8Var = rq4Var.i;
                if (x8Var != null) {
                    ta2Var.c((byte) 8);
                    ta2Var.d(x8Var.a);
                }
                a55 a55Var = rq4Var.j;
                if (a55Var != null) {
                    ta2Var.c((byte) 9);
                    ta2Var.d(a55Var.a);
                    ta2Var.d(a55Var.b);
                }
                long j5 = rq4Var.l;
                if (!yu.c(j5, j)) {
                    ta2Var.c((byte) 10);
                    ((Parcel) ta2Var.x).writeLong(j5);
                }
                a25 a25Var = rq4Var.m;
                if (a25Var != null) {
                    ta2Var.c((byte) 11);
                    ((Parcel) ta2Var.x).writeInt(a25Var.a);
                }
                yi4 yi4Var = rq4Var.n;
                if (yi4Var != null) {
                    ta2Var.c((byte) 12);
                    ((Parcel) ta2Var.x).writeLong(yi4Var.a);
                    long j6 = yi4Var.b;
                    ta2Var.d(kt2.c(j6));
                    ta2Var.d(kt2.d(j6));
                    ta2Var.d(yi4Var.c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) ta2Var.x).marshall(), 0)), cQf.b, cQf.c, 33);
            }
            charSequence = spannableString;
        }
        this.a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ys
    public final Z7jl getText() {
        ClipData primaryClip = this.a.getPrimaryClip();
        x41 x41Var = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (!(text instanceof Spanned)) {
                    return new Z7jl(text.toString(), null, 6);
                }
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                int length = annotationArr.length - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i];
                        if (ur1.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            ny1 ny1Var = new ny1(annotation.getValue());
                            x41 x41Var2 = x41Var;
                            v41 v41Var = x41Var2;
                            w41 w41Var = v41Var;
                            String string = w41Var;
                            x8 x8Var = string;
                            a55 a55Var = x8Var;
                            a25 a25Var = a55Var;
                            yi4 yi4Var = a25Var;
                            long j = yu.h;
                            long j2 = j;
                            long jG = z55.c;
                            long jG2 = jG;
                            while (true) {
                                int i2 = 1;
                                if (((Parcel) ny1Var.w).dataAvail() <= 1) {
                                    break;
                                }
                                byte b = ((Parcel) ny1Var.w).readByte();
                                if (b == 1) {
                                    if (ny1Var.e() < 8) {
                                        break;
                                    }
                                    j = ((Parcel) ny1Var.w).readLong();
                                    int i3 = yu.i;
                                } else if (b == 2) {
                                    if (ny1Var.e() < 5) {
                                        break;
                                    }
                                    jG = ny1Var.g();
                                } else if (b == 3) {
                                    if (ny1Var.e() < 4) {
                                        break;
                                    }
                                    x41Var2 = new x41(((Parcel) ny1Var.w).readInt());
                                } else if (b == 4) {
                                    if (ny1Var.e() < 1) {
                                        break;
                                    }
                                    byte b2 = ((Parcel) ny1Var.w).readByte();
                                    v41Var = new v41((b2 == 0 || b2 != 1) ? 0 : 1);
                                } else if (b == 5) {
                                    if (ny1Var.e() < 1) {
                                        break;
                                    }
                                    byte b3 = ((Parcel) ny1Var.w).readByte();
                                    if (b3 == 0) {
                                        i2 = 0;
                                    } else if (b3 != 1) {
                                        if (b3 == 3) {
                                            i2 = 3;
                                        } else if (b3 == 2) {
                                            i2 = 2;
                                        } else {
                                            i2 = 0;
                                        }
                                    }
                                    w41Var = new w41(i2);
                                } else if (b == 6) {
                                    string = ((Parcel) ny1Var.w).readString();
                                } else if (b == 7) {
                                    if (ny1Var.e() < 5) {
                                        break;
                                    }
                                    jG2 = ny1Var.g();
                                } else if (b == 8) {
                                    if (ny1Var.e() < 4) {
                                        break;
                                    }
                                    x8Var = new x8(ny1Var.f());
                                } else if (b == 9) {
                                    if (ny1Var.e() < 8) {
                                        break;
                                    }
                                    a55Var = new a55(ny1Var.f(), ny1Var.f());
                                } else if (b == 10) {
                                    if (ny1Var.e() < 8) {
                                        break;
                                    }
                                    j2 = ((Parcel) ny1Var.w).readLong();
                                    int i4 = yu.i;
                                } else if (b == 11) {
                                    if (ny1Var.e() < 4) {
                                        break;
                                    }
                                    int i5 = ((Parcel) ny1Var.w).readInt();
                                    boolean z = (i5 & 2) != 0;
                                    boolean z2 = (i5 & 1) != 0;
                                    a25Var = a25.d;
                                    a25 a25Var2 = a25.c;
                                    if (z && z2) {
                                        List listM = ps0.M(a25Var, a25Var2);
                                        Integer numValueOf = 0;
                                        int size = listM.size();
                                        for (int i6 = 0; i6 < size; i6++) {
                                            numValueOf = Integer.valueOf(((a25) listM.get(i6)).a | numValueOf.intValue());
                                        }
                                        a25Var = new a25(numValueOf.intValue());
                                    } else if (!z) {
                                        a25Var = z2 ? a25Var2 : a25.b;
                                    }
                                } else if (b == 12) {
                                    if (ny1Var.e() < 20) {
                                        break;
                                    }
                                    long j3 = ((Parcel) ny1Var.w).readLong();
                                    int i7 = yu.i;
                                    yi4Var = new yi4(j3, X.a(ny1Var.f(), ny1Var.f()), ny1Var.f());
                                }
                            }
                            arrayList.add(new Z7jl.CQf(spanStart, spanEnd, new rq4(j, jG, x41Var2, v41Var, w41Var, null, string, jG2, x8Var, a55Var, null, j2, a25Var, yi4Var)));
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        x41Var = null;
                    }
                }
                return new Z7jl(text.toString(), arrayList, 4);
            }
        }
        return null;
    }
}
