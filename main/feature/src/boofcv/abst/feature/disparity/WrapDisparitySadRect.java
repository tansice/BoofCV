/*
 * Copyright (c) 2011-2012, Peter Abeles. All Rights Reserved.
 *
 * This file is part of BoofCV (http://boofcv.org).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package boofcv.abst.feature.disparity;

import boofcv.alg.feature.disparity.DisparityScoreSadRect_U8;
import boofcv.struct.image.ImageUInt8;

/**
 * @author Peter Abeles
 */
public class WrapDisparitySadRect implements StereoDisparity<ImageUInt8,ImageUInt8>
{
	DisparityScoreSadRect_U8<ImageUInt8> alg;

	public WrapDisparitySadRect(DisparityScoreSadRect_U8<ImageUInt8> alg) {
		this.alg = alg;
	}

	@Override
	public void process(ImageUInt8 imageLeft, ImageUInt8 imageRight, ImageUInt8 output) {
		alg.process(imageLeft,imageRight,output);
	}

	@Override
	public int getBorderX() {
		return alg.getBorderX();
	}

	@Override
	public int getBorderY() {
		return alg.getBorderY();
	}

	@Override
	public int getMaxDisparity() {
		return alg.getMaxDisparity();
	}

	@Override
	public Class<ImageUInt8> getInputType() {
		return ImageUInt8.class;
	}

	@Override
	public Class<ImageUInt8> getDisparityType() {
		return ImageUInt8.class;
	}

	public DisparityScoreSadRect_U8<ImageUInt8> getAlg() {
		return alg;
	}
}
