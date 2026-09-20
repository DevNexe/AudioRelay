package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import com.azefsw.audioconnect.R;
import defpackage.cv2;

/* JADX INFO: loaded from: classes.dex */
public final class PRnFixed {
    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    public static QnHx a(Context context, Fragment fragment, boolean z, boolean z2) {
        int i;
        Fragment.CQf cQf = fragment.d0;
        boolean z3 = false;
        int i2 = cQf == null ? 0 : cQf.f;
        if (z2) {
            if (z) {
                if (cQf == null) {
                    i = 0;
                } else {
                    i = cQf.d;
                }
            } else if (cQf == null) {
                i = 0;
            } else {
                i = cQf.e;
            }
        } else if (z) {
            if (cQf == null) {
                i = 0;
            } else {
                i = cQf.b;
            }
        } else if (cQf == null) {
            i = 0;
        } else {
            i = cQf.c;
        }
        fragment.K(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.Z;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.Z.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.Z;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i == 0 && i2 != 0) {
            if (i2 == 4097) {
                i = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            } else if (i2 == 4099) {
                i = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
            } else if (i2 != 8194) {
                i = -1;
            } else {
                i = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
            }
        }
        if (i != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                    if (animationLoadAnimation != null) {
                        return new QnHx(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        return new QnHx(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                    if (animationLoadAnimation2 != null) {
                        return new QnHx(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    public static class QnHx {
        public final Animation a;
        public final Animator b;

        public QnHx(Animation animation) {
            this.a = animation;
            this.b = null;
        }

        public QnHx(Animator animator) {
            this.a = null;
            this.b = animator;
        }
    }

    public static class CQf extends AnimationSet implements Runnable {
        public boolean A;
        public final ViewGroup w;
        public final View x;
        public boolean y;
        public boolean z;

        public CQf(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.A = true;
            this.w = viewGroup;
            this.x = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.A = true;
            if (this.y) {
                return !this.z;
            }
            if (!super.getTransformation(j, transformation)) {
                this.y = true;
                cv2.a(this.w, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.y;
            ViewGroup viewGroup = this.w;
            if (z || !this.A) {
                viewGroup.endViewTransition(this.x);
                this.z = true;
            } else {
                this.A = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.A = true;
            if (this.y) {
                return !this.z;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.y = true;
                cv2.a(this.w, this);
            }
            return true;
        }
    }
}
