package com.qf.bannder;

import android.support.v4.view.ViewPager.PageTransformer;

import com.qf.bannder.transformer.AccordionTransformer;
import com.qf.bannder.transformer.BackgroundToForegroundTransformer;
import com.qf.bannder.transformer.CubeInTransformer;
import com.qf.bannder.transformer.CubeOutTransformer;
import com.qf.bannder.transformer.DefaultTransformer;
import com.qf.bannder.transformer.DepthPageTransformer;
import com.qf.bannder.transformer.FlipHorizontalTransformer;
import com.qf.bannder.transformer.FlipVerticalTransformer;
import com.qf.bannder.transformer.ForegroundToBackgroundTransformer;
import com.qf.bannder.transformer.RotateDownTransformer;
import com.qf.bannder.transformer.RotateUpTransformer;
import com.qf.bannder.transformer.ScaleInOutTransformer;
import com.qf.bannder.transformer.StackTransformer;
import com.qf.bannder.transformer.TabletTransformer;
import com.qf.bannder.transformer.ZoomInTransformer;
import com.qf.bannder.transformer.ZoomOutSlideTransformer;
import com.qf.bannder.transformer.ZoomOutTranformer;


public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
