package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.LPt8Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class nr0 {
    public final CQf a;

    public static class CQf {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    public static class F1 extends CQf {
        public final QnHx a;

        public F1(TextView textView) {
            this.a = new QnHx(textView);
        }

        @Override // nr0.CQf
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return (LPt8Fixed.j != null) ^ true ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // nr0.CQf
        public final boolean b() {
            return this.a.c;
        }

        @Override // nr0.CQf
        public final void c(boolean z) {
            if (!(LPt8Fixed.j != null)) {
                return;
            }
            this.a.c(z);
        }

        @Override // nr0.CQf
        public final void d(boolean z) {
            boolean z2 = !(LPt8Fixed.j != null);
            QnHx qnHx = this.a;
            if (z2) {
                qnHx.c = z;
            } else {
                qnHx.d(z);
            }
        }

        @Override // nr0.CQf
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return (LPt8Fixed.j != null) ^ true ? transformationMethod : this.a.e(transformationMethod);
        }
    }

    public static class QnHx extends CQf {
        public final TextView a;
        public final jr0 b;
        public boolean c = true;

        public QnHx(TextView textView) {
            this.a = textView;
            this.b = new jr0(textView);
        }

        @Override // nr0.CQf
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof jr0) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                jr0 jr0Var = this.b;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = jr0Var;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == jr0Var) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // nr0.CQf
        public final boolean b() {
            return this.c;
        }

        @Override // nr0.CQf
        public final void c(boolean z) {
            if (z) {
                TextView textView = this.a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // nr0.CQf
        public final void d(boolean z) {
            this.c = z;
            TextView textView = this.a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // nr0.CQf
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.c) {
                return ((transformationMethod instanceof pr0) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new pr0(transformationMethod);
            }
            return transformationMethod instanceof pr0 ? ((pr0) transformationMethod).w : transformationMethod;
        }
    }

    public nr0(TextView textView) {
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.a = new F1(textView);
    }
}
